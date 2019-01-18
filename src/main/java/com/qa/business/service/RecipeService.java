package com.qa.business.service;

public interface RecipeService {

	String getRecipe(String recipeJSON);

	String createRecipe(String recipeJSON);

	String deleteRecipe(String recipeJSON);

	String updateRecipe(String recipeJSON);

	String addIngredient(String ingredientJSON);

	String deleteIngredient(String ingredientJSON);

	String updateIngredient(String ingredientJSON);

	String getUsersRecipe(String username);

	String searchRecipes(String searchString);

}
