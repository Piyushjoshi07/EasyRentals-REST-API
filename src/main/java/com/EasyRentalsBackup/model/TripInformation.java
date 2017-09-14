package com.EasyRentalsBackup.model;

public class TripInformation {
	
	private long phoneNumber;
	
	private String drivingLicenseNumber;

	private String advNotice;
	
	private String shortPT;
	
	private String longPT;
	
	private boolean withDriver;
	
	private boolean withoutDriver;

	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public String getAdvNotice() {
		return advNotice;
	}

	public void setAdvNotice(String advNotice) {
		this.advNotice = advNotice;
	}

	public String getShortPT() {
		return shortPT;
	}

	public void setShortPT(String shortPT) {
		this.shortPT = shortPT;
	}

	public String getLongPT() {
		return longPT;
	}

	public void setLongPT(String longPT) {
		this.longPT = longPT;
	}
	
	

	public boolean isWithDriver() {
		return withDriver;
	}

	public void setWithDriver(boolean withDriver) {
		this.withDriver = withDriver;
	}

	public boolean isWithoutDriver() {
		return withoutDriver;
	}

	public void setWithoutDriver(boolean withoutDriver) {
		this.withoutDriver = withoutDriver;
	}

	@Override
	public String toString() {
		return "TripInformation [phoneNumber=" + phoneNumber + ", drivingLicenseNumber=" + drivingLicenseNumber
				+ ", advNotice=" + advNotice + ", shortPT=" + shortPT + ", longPT=" + longPT + ", withDriver="
				+ withDriver + ", withoutDriver=" + withoutDriver + "]";
	}

	
	
	
}
