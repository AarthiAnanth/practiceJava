package com.infy.drivinglicense;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LicenseDAO implements IDrivingLicense{

	@Override
	public Integer addRecords(DrivingLicense license) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction txt=session.beginTransaction();
		Integer licenseNumber=(Integer) session.save(license);
		txt.commit();
		session.close();
		return licenseNumber;
	}

	@Override
	public DrivingLicense read(Integer licenseNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
