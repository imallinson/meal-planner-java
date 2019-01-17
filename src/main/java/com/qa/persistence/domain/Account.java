package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Account {
	@Id
	private String username;
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
		
}
