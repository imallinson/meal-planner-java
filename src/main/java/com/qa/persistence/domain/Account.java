package com.qa.persistence.domain;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private String username;
	private String password;
	@OneToMany(mappedBy="username", cascade=CascadeType.PERSIST)
	private List<Meal> meals;
	@OneToMany(mappedBy="username", cascade=CascadeType.PERSIST)
	private List<Recipe> recipes;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}
			
}
