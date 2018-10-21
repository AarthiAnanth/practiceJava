package com.infybank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



public class CustomerDAO implements ICustomer
{

	@Override
	public void addCustomer(Customer custDAO) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(custDAO);
		tx.commit();
		session.close();
		
	}
	@Override
	public void readCustomer(int cust_Id)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer cust=session.get(Customer.class,cust_Id);
		System.out.println(cust.getCustomerId()+cust.getCustomerName());
		session.close();
	}
	@Override
	public void updateCustomer(int custId)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer cust1=session.get(Customer.class,custId);
		cust1.setCustomerName("rthi");
		Transaction tx=session.beginTransaction();
		session.save(cust1);
		tx.commit();
		session.close();
		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer cust2=session.get(Customer.class,id);
		Transaction tx=session.beginTransaction();
		session.delete(cust2);
		tx.commit();
		session.close();
		
		
	}
	@Override
	public void selectdemo()
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query selectclause=session.createQuery("select cust.customerId from Customer cust");
		for(Iterator<Integer> li1= selectclause.iterate(); li1.hasNext();)  {
          	Integer custId = li1.next();
          System.out.println("Customer Id : "+custId);
		}
          Query query = session.createQuery("from Customer");
          List<Customer> custList = query.list();
          ArrayList<Customer> alist=(ArrayList<Customer>)custList;
          for (Customer elist : alist) {
              System.out.println(elist.getCustomerId());
          }
          //SELECT clause with from & where
          Query selectClause1 = session.createQuery("select cust.customerName from Customer cust where cust.customerId = 103");
          List<String> custList1 = selectClause1.list();
          System.out.println("Displaying Name from table employee whose id is 1002");
          for(Iterator<String> li2= selectClause1.iterate(); li2.hasNext();){
             String custName = li2.next();
             System.out.println("Customer Name : "+custName);
          
          }
	}
	
	@Override
	public void updatedemo()
	{
		System.out.println("Updating using HQL");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query updateClause=session.createQuery("update Customer cust set cust.customerName='Akila' where cust.customerId=106");
		int update=updateClause.executeUpdate();
		if(update==0 ||update==1)
		{
			System.out.println("Row affected");
		}
		 else{
             System.out.println(update + " rows affected");
          }
          session.getTransaction().commit();
		
	}
	
	
}


