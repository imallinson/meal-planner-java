package com.qa.persistence.repository;

import java.util.List;

import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Recipe;

public interface RecipeRepository {

	Recipe getRecipe(Long recipeID);

	List<Recipe> getUsersRecipe(String username);

	List<Recipe> searchRecipes(String searchString);

	String createRecipe(Recipe recipe);

	String deleteRecipe(Recipe recipe);

	String updateRecipe(Recipe recipe);

	String addIngredient(Ingredient ingredient);

	String deleteIngredient(Ingredient ingredient);

	String updateIngredient(Ingredient ingredient);

}
