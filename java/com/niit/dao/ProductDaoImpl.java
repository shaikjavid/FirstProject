package com.niit.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao 
{
SessionFactory sessionFactory;

@Autowired
public void setSessionFactory(SessionFactory sessionFactory) {
   this.sessionFactory = sessionFactory;
}

public boolean addProduct(Product product)
{
System.out.println("i am in add product dao");
try{
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();
session.saveOrUpdate(product);
tx.commit();
return true;
}
catch(Exception e)
{
e.printStackTrace();
return false;
}
}

@SuppressWarnings("unchecked")
public List<Product> allProducts() {
Session session =   sessionFactory.openSession();
return session.createQuery("From Product").getResultList();
}

public Product get(int id) {
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();
return session.get(Product.class, id);
}

public boolean update(Product product) 
{
System.out.println("Product Price::::::::::::::::::::"+product.getProductPrice());
// TODO Auto-generated method stub
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();
try{
session.update(product);
tx.commit();
return true;
}
catch(Exception e){
System.out.println("exception in ProductDao:::::::::::::::"+e);
return false;
}
}


@SuppressWarnings({ "deprecation", "rawtypes" })
public boolean delete(int id) {
System.out.println("testing");
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();
Query q;
try{
q= session.createQuery("DELETE Product WHERE productId = :ID");
q.setParameter("ID", id);
q.executeUpdate();
tx.commit();
return true;
}catch (Exception e) {
// TODO: handle exception
System.out.println(e);
return false;
}
}

@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
public List<Product> getCatProducts(Integer id) {
// TODO Auto-generated method stub
Session session = sessionFactory.openSession();
try{
Query q=session.createQuery("from Product where categoryid=:Id");
q.setParameter("Id", id);
return q.getResultList();
}
catch(Exception e)
{
return null;
}
}


}