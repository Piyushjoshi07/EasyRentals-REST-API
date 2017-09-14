package com.EasyRentalsBackup.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	
    private Long id;
	
private static AtomicLong COUNTER = new AtomicLong(0L);
    
    @PersistenceConstructor
    public User() {
        this.id = COUNTER.incrementAndGet();
    }
        
    private String fName;
 
    private String lName;
    
    private String email;
    
     private String password;

     
     
	public Long getId() {
		return id;
	}

	/*public void setId(Long id) {
		this.id = id;
	}*/

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserId(int i) {
		// TODO Auto-generated method stub
		
	}

	
 
     
    
    }

