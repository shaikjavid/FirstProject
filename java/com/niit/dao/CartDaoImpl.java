package com.niit.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Cart;

@Repository("cartDao")
public class CartDaoImpl implements CartDao 
{
@Autowired
SessionFactory sessionFactory;


@Override
public boolean addCart(Cart cart) {
Session s=
sessionFactory.openSession();
Transaction tx=s.beginTransaction();
s.save(cart);
tx.commit();
return false;
}

@Override
public boolean updateCart(Cart cart) {
try{
Session session;
System.out.println("cart id in update cart :::::::::::"+cart.getId());
session=sessionFactory.openSession();
Transaction t =session.beginTransaction();
session.update(cart);
t.commit();
return true;
}catch(Exception e)
{
System.out.println(e);
return false;
}
}

@SuppressWarnings({ "deprecation", "rawtypes" })
@Override
public boolean resetCart(int id) {
System.out.println("cart id"+id);
Query q=
sessionFactory.getCurrentSession().createQuery("update Cart set grandTotal=:total, quantity=:quan where id=:id ");
q.setParameter("total", 0.0f);
q.setParameter("quan", 0);
q.setParameter("id", id);
int i=
q.executeUpdate();
System.out.println("updated cart i value:::::::::::::::::"+i);
return false;
}

@Override
public Cart getCart(Integer id) {
try
{
return sessionFactory.getCurrentSession().createQuery("from Cart where id=:id",Cart.class).getSingleResult();
}
catch(Exception e)
{
System.out.println(e);
return null;
}
}

}
