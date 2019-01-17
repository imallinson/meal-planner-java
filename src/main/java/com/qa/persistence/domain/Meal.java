package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Meal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mealID;
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

	public Long getMealID() {
		return mealID;
	}

}
