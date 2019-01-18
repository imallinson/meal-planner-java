package com.qa.business.service;

public interface ShoppingListService {

	String getShoppingList(String usernameJSON);

	String addMeal(String mealJSON);

	String addIngredient(String mealJSON);

	String deleteIngredient(String ingredientJSON);

	String updateIngredient(String ingredientJSON);

	String clearShoppingList();

}
