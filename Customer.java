package com.infybank;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name="idgenerator", strategy="increment")
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="CUSTOMERID")
	@GeneratedValue(generator="idgenerator")
	private int customerId;
	@Column(name="CUSTOMERNAME")
	private String customerName;
	
	public Customer()
	{
		
	} 
	public Customer(int id,String name)
	{
		this.customerId=id;
		this.customerName=name;
	}

	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

}
