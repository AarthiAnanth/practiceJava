package com.infybank;

public interface ICustomer {
	public void addCustomer(Customer custDAO);
	public void readCustomer(int cust_Id);
	public void updateCustomer(int custId);
	public void delete(int id);
	void updatedemo();
	void selectdemo();
	
	

}
