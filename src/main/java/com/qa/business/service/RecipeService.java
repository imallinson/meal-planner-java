package com.qa.business.service;

public interface RecipeService {

	String getRecipe(String recipeJSON);

	String createRecipe(String recipeJSON);

	String deleteRecipe(String recipeJSON);

	String updateRecipe(String recipeJSON);

}
