package com.qa.business.service;

public interface RecipeService {

	String getRecipe(Long recipeID);

	String getUsersRecipe(String username);

	String searchRecipes(String searchString);

	String createRecipe(String recipeJSON);

	String deleteRecipe(Long recipeID);

	String updateRecipe(String recipeJSON);

	String addIngredient(String ingredientJSON);

	String deleteIngredient(Long ingredientID);

	String updateIngredient(String ingredientJSON);

}
