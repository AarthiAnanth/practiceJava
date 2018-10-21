package com.infy.drivinglicense;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="Driving_License")
@GenericGenerator(name="native_generator",strategy="assigned")
public class DrivingLicense {
	
	@Id
	@GeneratedValue(generator="native_generator")
	Integer licenseNumber;
	String name;
	Integer age;
	String gender;
	String address;
	@Column(name="licenseIssuedDate")
	Date licenseIssueDate;
	
	Date licenseExpiryDate;
	@Column(name="licenseIssuedZone")
	String licenseIssueZone;
	
	//implement constructor
	//implement getters and setters
	
	public DrivingLicense()
	{
		
	}
	public DrivingLicense(int licenseNumber, String name,Integer age,String gender,String address,Date licenseIssueDate,Date licenseExpiryDate,String licenseIssueZone)
	{
		this.licenseNumber=licenseNumber;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
		this.licenseExpiryDate=licenseExpiryDate;
		this.licenseIssueDate=licenseIssueDate;
		this.licenseIssueZone=licenseIssueZone;
	}
	public Integer getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(Integer licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getLicenseIssueDate() {
		return licenseIssueDate;
	}
	public void setLicenseIssueDate(Date licenseIssueDate) {
		this.licenseIssueDate = licenseIssueDate;
	}
	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}
	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}
	public String getLicenseIssueZone() {
		return licenseIssueZone;
	}
	public void setLicenseIssueZone(String licenseIssueZone) {
		this.licenseIssueZone = licenseIssueZone;
	}
}

