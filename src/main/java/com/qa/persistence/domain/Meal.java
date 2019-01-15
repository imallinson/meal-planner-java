package com.qa.persistence.domain;

public class Meal {
	private int mealID;
	private int date;
	private MealTime mealTime;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public MealTime getMealTime() {
		return mealTime;
	}

	public void setMealTime(MealTime mealTime) {
		this.mealTime = mealTime;
	}

	public int getMealID() {
		return mealID;
	}

}
