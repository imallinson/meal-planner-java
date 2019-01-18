package com.qa.persistence.repository;

import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Recipe;

public interface RecipeRepository {

	String getRecipe(Recipe recipe);

	String createRecipe(Recipe recipe);

	String deleteRecipe(Recipe recipe);

	String updateRecipe(Recipe recipe);

	String addIngredient(Ingredient ingredient);

	String deleteIngredient(Ingredient ingredient);

	String updateIngredient(Ingredient ingredient);

}
