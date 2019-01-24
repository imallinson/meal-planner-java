package com.qa.business.service;

import javax.enterprise.inject.Default; 
import javax.inject.Inject;

import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Meal;
import com.qa.persistence.repository.ShoppingListRepository;
import com.qa.util.JSONUtil;

@Default
public class ShoppingListServiceImp implements ShoppingListService {
	@Inject
	private ShoppingListRepository repo;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getShoppingList(Long accountID) {
		return util.getJSONForObject(repo.getShoppingList(accountID));
	}

	@Override
	public String addMeal(String mealJSON) {
		Meal meal = util.getObjectForJSON(mealJSON, Meal.class);
		return repo.addMeal(meal);
	}

	@Override
	public String addIngredient(String ingredientJSON) {
		Ingredient ingredient = util.getObjectForJSON(ingredientJSON, Ingredient.class);
		return repo.addIngredient(ingredient);
	}

	@Override
	public String deleteIngredient(String ingredientJSON) {
		Ingredient ingredient = util.getObjectForJSON(ingredientJSON, Ingredient.class);
		return repo.deleteIngredient(ingredient);
	}

	@Override
	public String updateIngredient(String ingredientJSON) {
		Ingredient ingredient = util.getObjectForJSON(ingredientJSON, Ingredient.class);
		return repo.updateIngredient(ingredient);
	}

	@Override
	public String clearShoppingList(Long accountID) {
		return repo.clearShoppingList(accountID);
	}

}
