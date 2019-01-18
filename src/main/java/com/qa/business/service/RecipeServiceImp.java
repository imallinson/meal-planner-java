package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Recipe;
import com.qa.persistence.repository.RecipeRepository;
import com.qa.util.JSONUtil;

public class RecipeServiceImp implements RecipeService {
	@Inject
	private RecipeRepository repo;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public String getRecipe(String recipeJSON) {
		Recipe recipe = util.getObjectForJSON(recipeJSON, Recipe.class);
		return repo.getRecipe(recipe);
	}

	@Override
	public String createRecipe(String recipeJSON) {
		Recipe recipe = util.getObjectForJSON(recipeJSON, Recipe.class);
		return repo.createRecipe(recipe);
	}

	@Override
	public String deleteRecipe(String recipeJSON) {
		Recipe recipe = util.getObjectForJSON(recipeJSON, Recipe.class);
		return repo.deleteRecipe(recipe);
	}

	@Override
	public String updateRecipe(String recipeJSON) {
		Recipe recipe = util.getObjectForJSON(recipeJSON, Recipe.class);
		return repo.updateRecipe(recipe);
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

}
