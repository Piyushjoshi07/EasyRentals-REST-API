package com.EasyRentalsBackup.model;


public class Address {


	
	private String steert;
	
	private String City;
	
	private String State;
	
	private int postalCode;
	
	private Location geoLocation;


	public String getSteert() {
		return steert;
	}

	public void setSteert(String steert) {
		this.steert = steert;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public Location getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(Location geoLocation) {
		this.geoLocation = geoLocation;
	}
	
	
}
