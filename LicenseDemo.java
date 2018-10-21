package com.infy.drivinglicense;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LicenseDemo {
	public static void main(String[] args){
	IDrivingLicense licensedao=new LicenseDAO();
	try
	{
		DrivingLicense dl=new DrivingLicense();
		dl.setAge(23);
		dl.setAddress("fdjhfdjsfh");
		dl.setGender("female");
		dl.setLicenseNumber(101);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		String date="28-Jun-1993";
		String issueDate="12-Aug-1888";
		Date date2=null;
		Date dateIssue=null;
		date2=dateFormat.parse(date);
		dateIssue=dateFormat.parse(issueDate);
		dl.setLicenseExpiryDate(date2);
		dl.setLicenseIssueDate(dateIssue);
		dl.setLicenseIssueZone("Hosur");
		
		
		DrivingLicense dl1=new DrivingLicense();
		dl1.setAge(23);
		dl1.setAddress("fdjhfdjsfh");
		dl1.setGender("female");
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
		String date1="28-Jun-1993";
		String issueDate1="12-Aug-1888";
		Date date21=null;
		Date dateIssue1=null;
		date21=dateFormat.parse(date1);
		dateIssue=dateFormat.parse(issueDate1);
		dl1.setLicenseExpiryDate(date21);
		dl1.setLicenseIssueDate(dateIssue1);
		dl1.setLicenseIssueZone("Hosur");
		
		licensedao.addRecords(dl);
		licensedao.addRecords(dl1);

			
				

}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}