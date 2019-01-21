package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Meal;

@Transactional(SUPPORTS)
public class MealDBRepostiory implements MealRepostiory {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Override
	public Meal getMeal(Meal meal) {
		return findMeal(meal.getMealID());
	}

	@Override
	public String createMeal(Meal meal) {
		manager.persist(meal);
		return "{\"message\": \"meal sucessfully created\"}";
	}

	@Override
	public String deleteMeal(Meal meal) {
		manager.remove(meal);
		return "{\"message\": \"meal sucessfully deleted\"}";
	}

	@Override
	public String updateMeal(Meal meal) {
		Meal mealInDB = findMeal(meal.getMealID());
		manager.remove(mealInDB);
		manager.persist(meal);
		return "{\"message\": \"meal sucessfully updated\"}";
	}
	
	private Meal findMeal(Long mealID) {
		return manager.find(Meal.class, mealID);
	}

}
