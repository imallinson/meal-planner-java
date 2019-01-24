package com.qa.business.service;

public interface ShoppingListService {

	String getShoppingList(Long accountID);

	String addMeal(String mealJSON);

	String addIngredient(String ingredientJSON);

	String deleteIngredient(String ingredientJSON);

	String updateIngredient(String ingredientJSON);

	String clearShoppingList(Long accountID);

}
