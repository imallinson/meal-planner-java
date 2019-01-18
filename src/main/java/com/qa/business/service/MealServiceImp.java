package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Meal;
import com.qa.persistence.repository.MealRepostiory;
import com.qa.util.JSONUtil;

public class MealServiceImp implements MealService {
	@Inject
	private MealRepostiory repo;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getMeal(String mealJSON) {
		Meal meal = util.getObjectForJSON(mealJSON, Meal.class);
		return repo.getMeal(meal);
	}

	@Override
	public String createMeal(String mealJSON) {
		Meal meal = util.getObjectForJSON(mealJSON, Meal.class);
		return repo.createMeal(meal);
	}

	@Override
	public String deleteMeal(String mealJSON) {
		Meal meal = util.getObjectForJSON(mealJSON, Meal.class);
		return repo.deleteMeal(meal);
	}

	@Override
	public String updateMeal(String mealJSON) {
		Meal meal = util.getObjectForJSON(mealJSON, Meal.class);
		return repo.updateMeal(meal);
	}

}
