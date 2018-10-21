package com.infy.studentdetails;

import org.hibernate.HibernateException;

public class StudentDemo {

	public static void main(String[] args)
	{
		IStudent student=new StudentDAO();
		Student s1=new Student("hari",23,"9A","kjngkfdgkd");
		try
		{
			student.addRecords(s1);
			System.out.println("Record added");
		}
		catch(HibernateException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
