package com.qa.persistence.repository;

import com.qa.persistence.domain.Account;
import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Meal;

public interface ShoppingListRepository {

	String getShoppingList(Account account);

	String addMeal(Meal meal);

	String addIngredient(Ingredient ingredient);

	String deleteIngredient(Ingredient ingredient);

	String updateIngredient(Ingredient ingredient);

	String clearShoppingList();

}
