package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Meal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mealID;
	private String date;
	private MealTime mealTime;
	private int servings;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="recipeID")
	private Recipe recipe;
	private String username;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public MealTime getMealTime() {
		return mealTime;
	}

	public void setMealTime(MealTime mealTime) {
		this.mealTime = mealTime;
	}

	public Long getMealID() {
		return mealID;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public String getUsername() {
		return username;
	}
	
	
}
