package com.qa.business.service;

public interface MealService {

	String getMeal(String mealJSON);

	String createMeal(String mealJSON);

	String deleteMeal(String mealJSON);

	String updateMeal(String mealJSON);

}
