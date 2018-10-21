package com.infy.studentdetails;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO implements IStudent{
	@Override
		public Integer addRecords(Student student){
			
			//implement the code here
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			Integer id= (Integer) session.save(student);
			tx.commit();
			session.close();
			
			return id;
			
			
		}
	@Override
		public Student read(Integer rollNo){
			
			//implement the code here
			
			return null;
		}
	

}
