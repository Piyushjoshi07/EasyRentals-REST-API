package com.EasyRentalsBackup.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="car")
public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private Long contactNum;
    
	private Address address;
	
	@Id
	private String licenseNum;
	
	private String drivingLicenseNumber;
	
	private String DrivingLicenseState;
	
	private String year;
	
	private String make;
	
	private String model;
	
	private String transmission;
	
	private double odometer;
	
	private String style;
	
	private boolean GPS;
	
	private boolean hybrid;
	
	private boolean petFriendly;
	
	private boolean bluetooth;
	
	private boolean audioPlayer;
	
	private boolean sunRoof;
	
	private boolean withDriver;
	
	private boolean withoutDriver;
	
	private long amount;
	
	private String maximumDistance;



	public Long getContactNum() {
		return contactNum;
	}


	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	public String getLicenseNum() {
		return licenseNum;
	}


	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}


	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	
	

	public String getDrivingLicenseState() {
		return DrivingLicenseState;
	}

	public void setDrivingLicenseState(String drivingLicenseState) {
		DrivingLicenseState = drivingLicenseState;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean isGPS() {
		return GPS;
	}

	public void setGPS(boolean gPS) {
		GPS = gPS;
	}

	public boolean isHybrid() {
		return hybrid;
	}

	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}

	public boolean isPetFriendly() {
		return petFriendly;
	}

	public void setPetFriendly(boolean petFriendly) {
		this.petFriendly = petFriendly;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean isAudioPlayer() {
		return audioPlayer;
	}

	public void setAudioPlayer(boolean audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
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

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}



	public String getMaximumDistance() {
		return maximumDistance;
	}

	public void setMaximumDistance(String maximumDistance) {
		this.maximumDistance = maximumDistance;
	}

	@Override
	public String toString() {
		return "CarDetails [contactNum=" + contactNum + ", address=" + address + ", drivingLicenseNumber="
				+ drivingLicenseNumber + ", year=" + year + ", make=" + make + ", model=" + model + ", transmission="
				+ transmission + ", odometer=" + odometer + ", style=" + style + ", GPS=" + GPS + ", hybrid=" + hybrid
				+ ", petFriendly=" + petFriendly + ", bluetooth=" + bluetooth + ", audioPlayer=" + audioPlayer
				+ ", sunRoof=" + sunRoof + ", withDriver=" + withDriver + ", withoutDriver=" + withoutDriver
				+ ", amount=" + amount + ", maximumDistance=" + maximumDistance + "]";
	}
}