package com.qa.persistence.repository;

import com.qa.persistence.domain.Meal;

public interface MealRepostiory {

	Meal getMeal(Meal meal);

	String createMeal(Meal meal);

	String deleteMeal(Meal meal);

	String updateMeal(Meal meal);

}
