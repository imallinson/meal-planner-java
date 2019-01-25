package com.qa.business.service;

public interface MealService {

	String getMeal(Long mealID);

	String createMeal(String mealJSON);

	String deleteMeal(Long mealID);

	String updateMeal(String mealJSON);

}
