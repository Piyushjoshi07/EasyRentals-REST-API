package com.EasyRentalsBackup.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Long contactNum;
    
        
    private String fName;
 
    private String lName;
    
    private String email;
    
     private String password;

     



	public Long getContactNum() {
		return contactNum;
	}

	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}

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

