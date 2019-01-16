package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Account {
	@Id
	private String userName;
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
		
}
