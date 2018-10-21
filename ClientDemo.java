package com.infybank;

import java.util.Scanner;
import org.hibernate.HibernateException;
public class ClientDemo {
	public static void main(String[] args) {
		CustomerDAO custdao=new CustomerDAO();
		try
		{
			System.out.println("Create");
			System.out.println("Enter the data");
			Scanner sc=new Scanner(System.in);
			//System.out.println("ID");
			//int id=sc.nextInt();
			System.out.println("Name");
			String str=sc.next();
			Customer cust=new Customer();
			//cust.setCustomerId(id);
			cust.setCustomerName(str);
			custdao.addCustomer(cust);
			System.out.println("One record created");
//			custdao.readCustomer(110);
//			custdao.updateCustomer(102);
//			System.out.println("One row updated");
//			custdao.delete(102);
//			System.out.println("one row deleted");
//			sc.close();
			
		}
		catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
