package com.infy.studentdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity

@Table(name="STUDENT_DETAILS")
@GenericGenerator(name = "hibhilo", strategy = "hilo",
parameters = {@Parameter(name = "max_lo", value = "2")})

public class Student {

		@Id
		   @GeneratedValue(generator = "hibhilo")
		private Integer rollNo;
		private String name;
		private Integer age;
		@Column(name="class_section")
		private String classSection;
		private String address;
		public Student()
		{
			
		}
		public Student(String name,Integer age,String classSection,String address)
		{
			this.name=name;
			this.age=age;
			this.classSection=classSection;
			this.address=address;
		}
		public Integer getRollNo() {
			return rollNo;
		}
		public void setRollNo(Integer rollNo) {
			this.rollNo = rollNo;
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
		public String getClassSection() {
			return classSection;
		}
		public void setClassSection(String classSection) {
			this.classSection = classSection;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

	        //implement constructor
		//implement getters and setters
	

}
