package com.EasyRentalsBackup.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CarDetails")
public class CarDetails {
	
	private long phoneNumber;
 
	private Address address;
	
	private String drivingLicenseNumber;
	
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
	
	private long maximumDistance;

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
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

	public long getMaximumDistance() {
		return maximumDistance;
	}

	public void setMaximumDistance(long maximumDistance) {
		this.maximumDistance = maximumDistance;
	}

	@Override
	public String toString() {
		return "CarDetails [phoneNumber=" + phoneNumber + ", address=" + address + ", drivingLicenseNumber="
				+ drivingLicenseNumber + ", year=" + year + ", make=" + make + ", model=" + model + ", transmission="
				+ transmission + ", odometer=" + odometer + ", style=" + style + ", GPS=" + GPS + ", hybrid=" + hybrid
				+ ", petFriendly=" + petFriendly + ", bluetooth=" + bluetooth + ", audioPlayer=" + audioPlayer
				+ ", sunRoof=" + sunRoof + ", withDriver=" + withDriver + ", withoutDriver=" + withoutDriver
				+ ", amount=" + amount + ", maximumDistance=" + maximumDistance + "]";
	}
	
	
	
	
	
}
