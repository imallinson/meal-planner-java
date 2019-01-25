package com.qa.persistence.repository;
 
import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Meal;
import com.qa.persistence.domain.ShoppingList;

public interface ShoppingListRepository {

	ShoppingList getShoppingList(Long accountID);

	String addMeal(Meal meal);

	String addIngredient(Ingredient ingredient);

	String deleteIngredient(Long ingredientID);

	String updateIngredient(Ingredient ingredient);

	String clearShoppingList(Long accountID);

}
