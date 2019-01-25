package com.qa.persistence.repository;

import com.qa.persistence.domain.Meal;

public interface MealRepostiory {

	Meal getMeal(Long mealID);

	String createMeal(Meal meal);

	String deleteMeal(Long mealID);

	String updateMeal(Meal meal);

}
