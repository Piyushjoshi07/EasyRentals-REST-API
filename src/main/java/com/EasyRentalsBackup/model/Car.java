package com.EasyRentalsBackup.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
//import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="car")
public class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	private Long id;
	
	
private static AtomicLong COUNTER = new AtomicLong(0L);
    
    @PersistenceConstructor
    public Car() {
        this.id = COUNTER.incrementAndGet();
    }
	
	
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
	
	
	
	
    
    
    
    
    
    
    
    
   /* private Long zipcode;
	
	//@GeoSpatialIndexed
	//private String location;
	
	//private Double latitude;
	
	//private Double longitude;
	
	//private Location geoLocation;
	
	private Address address;
	
	private String year;
	
	private String make;
	
	private String model;
	
	private String transmission;
	
	private double odometer;
	
	private String trim;
	
	private String style;
	
	private String licenseNum;
	
	private String issuingCountry;
	
	private String issuingState;
	
	private String fNameOnLic;

	private String lNameOnLic;
	
	private Date dob;
	
	private String profilePic;
	
	private String advNotice;
	
	private String shortPT;
	
	private String longPT;
	
	private String licensePlateNum;
	
	private String licenseState;
	
	private String bluetooth;
	
	private String gps;
	
	private String hybrid;
	
	private String petFriendly;
	
	private String audioPlayer;
	
	private String sunRoof;
	
	private String carDes;
	
	//private String carPic;

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	/*public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	

	public String getYear() {
		return year;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getIssuingCountry() {
		return issuingCountry;
	}

	public void setIssuingCountry(String issuingCountry) {
		this.issuingCountry = issuingCountry;
	}

	
	public String getIssuingState() {
		return issuingState;
	}

	public void setIssuingState(String issuingState) {
		this.issuingState = issuingState;
	}

	public String getfNameOnLic() {
		return fNameOnLic;
	}

	public void setfNameOnLic(String fNameOnLic) {
		this.fNameOnLic = fNameOnLic;
	}

	public String getlNameOnLic() {
		return lNameOnLic;
	}

	public void setlNameOnLic(String lNameOnLic) {
		this.lNameOnLic = lNameOnLic;
	}



	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
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

	public String getLicensePlateNum() {
		return licensePlateNum;
	}

	public void setLicensePlateNum(String licensePlateNum) {
		this.licensePlateNum = licensePlateNum;
	}

	public String getLicenseState() {
		return licenseState;
	}

	public void setLicenseState(String licenseState) {
		this.licenseState = licenseState;
	}

	
	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getHybrid() {
		return hybrid;
	}

	public void setHybrid(String hybrid) {
		this.hybrid = hybrid;
	}

	public String getPetFriendly() {
		return petFriendly;
	}

	public void setPetFriendly(String petFriendly) {
		this.petFriendly = petFriendly;
	}

	public String getAudioPlayer() {
		return audioPlayer;
	}

	public void setAudioPlayer(String audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	public String getSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(String sunRoof) {
		this.sunRoof = sunRoof;
	}

	public String getCarDes() {
		return carDes;
	}

	public void setCarDes(String carDes) {
		this.carDes = carDes;
	}
	
	
}*/
