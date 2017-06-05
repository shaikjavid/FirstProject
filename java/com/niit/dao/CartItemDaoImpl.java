package com.niit.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Cart;
import com.niit.model.CartItem;

@Repository("cartitemDao")
public class CartItemDaoImpl implements CartItemDao 
{
@Autowired
SessionFactory sessionFactory;

public boolean addCartItem(CartItem cartItem) {
try{
sessionFactory.getCurrentSession().save(cartItem);
return true;
}
catch (Exception e) {
// TODO: handle exceptionm
System.out.println(e);
return false;
}
}

public List<CartItem> getAll(int id) {
return sessionFactory.getCurrentSession().createQuery("FROM CartItem where CART_ID=:id", CartItem.class).setParameter("id", id).getResultList();
}

public boolean deleteCartItem(CartItem cartItem) {
 
try{
sessionFactory.getCurrentSession().delete(cartItem);
return true;
}catch(Exception e)
{
System.out.println(e);
return false;
}
}

public CartItem getCartItem(int id) {
// TODO Auto-generated method stub
return sessionFactory.getCurrentSession().get(CartItem.class, id);
}

@SuppressWarnings({ "deprecation", "rawtypes" })
public boolean deleteAll(int cart_id) {
try{
// TODO Auto-generated method stub
Query q=sessionFactory.getCurrentSession().createQuery("delete from Cart_Item where cart_id=:id");
q.setParameter("id", cart_id);
q.executeUpdate();
return true;
}catch(Exception e){
System.out.println(e);
return false;
}
}

public CartItem getExistingCartItemCount(int productId, int cart_id) {
Query q=sessionFactory.getCurrentSession().createQuery("from Cart_Item where cart_id=:cartid and product_productId=:productid");
q.setParameter("cartid", cart_id);
q.setParameter("productid", productId);
try{
return (CartItem) q.getSingleResult();
}catch(NoResultException nre)
{
return null;
}
}


public boolean updateCartItem(CartItem cartItem) {
try {
sessionFactory.getCurrentSession().update(cartItem);
return true;
} catch (Exception e) {
// TODO: handle exception
System.out.println(e);
return false;
}
}

}




