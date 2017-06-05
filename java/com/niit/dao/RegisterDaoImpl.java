package com.niit.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Chronicling;

@Repository("regdao")
public class RegisterDaoImpl implements RegisterDao
{
	@Autowired
SessionFactory sessionFactory;

public void addData(Chronicling chronicling)
{
	Session session=sessionFactory.openSession();
	//session.beginTransaction();
	Transaction tx=session.beginTransaction();
	session.saveOrUpdate(chronicling);
	tx.commit();
}
public void userUdate()
{
	
}
public Chronicling getUser(int id)
{
	return null;
}
@SuppressWarnings("deprecation")
public Chronicling getOnlinemail(String Onlinemail)
{
	Session s = sessionFactory.openSession();
	
	@SuppressWarnings("rawtypes")
	Query q=s.createQuery("From Chronicling where Onlinemail=:Onlinemail",Chronicling.class);
	q.setParameter("Onlinemail",Onlinemail);
	try
	{
		Object o=q.getSingleResult();
		return (Chronicling) o;
	}
	catch(Exception e) {
		return null;
	}
	
	
}
@Override
public void userUpdate() {
	// TODO Auto-generated method stub
	
}


}
