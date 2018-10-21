package com.infy.drivinglicense;

public interface IDrivingLicense {
	public Integer addRecords(DrivingLicense license);
	public DrivingLicense read(Integer licenseNumber);
}
