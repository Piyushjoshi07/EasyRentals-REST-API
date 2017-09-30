package com.EasyRentalsBackup.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Reservation")
public class Reservation {
	
	@Id
	private long id;
	
private static AtomicLong COUNTER = new AtomicLong(0L);
    
    @PersistenceConstructor
    public Reservation() throws Exception {
        this.id = COUNTER.incrementAndGet();
    }
     
private Long contactNum;
	
	private String licenseNum;
    
    String startDate;
  private  Date string1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate);
	//private Date fromDate;
	

  String endDate;
private  Date String2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endDate);
	//private Date tillDate;
	
	
	
	


	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Date getString1() {
		return string1;
	}

	public void setString1(Date string1) {
		this.string1 = string1;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Date getString2() {
		return String2;
	}

	public void setString2(Date string2) {
		String2 = string2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getContactNum() {
		return contactNum;
	}

	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}


	
	

}
