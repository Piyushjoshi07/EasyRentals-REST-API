package com.EasyRentalsBackup.model;

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
    public Reservation() {
        this.id = COUNTER.incrementAndGet();
    }
      
	
	private Date fromDate;
	
	private Date tillDate;
	
	private Long userId;
	
	private Long carId;
	
	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getTillDate() {
		return tillDate;
	}

	public void setTillDate(Date tillDate) {
		this.tillDate = tillDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}
	
	

}
