package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED; 
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Recipe;

@Transactional(SUPPORTS)
@Default
public class RecipeDBRepository implements RecipeRepository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Override
	public Recipe getRecipe(Long recipeID) {
		return findRecipe(recipeID);
	}

	@Override
	public List<Recipe> getUsersRecipe(String username) {
		Query query = manager.createQuery("SELECT r FROM Recipe r");
		List<Recipe> allRecipes = query.getResultList();
		List<Recipe> usersRecipes = allRecipes.stream().filter(r -> r.getUsername().equals(username)).collect(Collectors.toList());
		return usersRecipes;
	}

	@Override
	public List<Recipe> searchRecipes(String searchString) {
		Query query = manager.createQuery("SELECT r FROM Recipe r");
		List<Recipe> allRecipes = query.getResultList();
		List<Recipe> searchedRecipes = allRecipes.stream().filter(r -> r.getRecipeName().contains(searchString)).collect(Collectors.toList());
		return searchedRecipes;	
	}

	@Override
	@Transactional(REQUIRED)
	public String createRecipe(Recipe recipe) {
		manager.persist(recipe);
		return "{\"message\": \"recipe sucessfully created\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteRecipe(Long recipeID) {
		Recipe recipe = findRecipe(recipeID);
		manager.remove(recipe);
		return "{\"message\": \"recipe sucessfully deleted\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateRecipe(Recipe recipe) {
		Recipe recipeInDB = findRecipe(recipe.getRecipeID());
		manager.remove(recipeInDB);
		manager.persist(recipe);
		return "{\"message\": \"recipe sucessfully updated\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String addIngredient(Ingredient ingredient) {
		manager.persist(ingredient);
		return "{\"message\": \"ingredient sucessfully created\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteIngredient(Long ingredientID) {
		Ingredient ingredient = findIngredient(ingredientID);
		manager.remove(ingredient);
		return "{\"message\": \"ingredient sucessfully deleted\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateIngredient(Ingredient ingredient) {
		Ingredient ingredientInDB = findIngredient(ingredient.getIngredientID());
		manager.remove(ingredientInDB);
		manager.persist(ingredient);
		return "{\"message\": \"ingredient sucessfully updated\"}";
	}

	private Recipe findRecipe(Long recipeID) {
		return manager.find(Recipe.class, recipeID);
	}
	
	private Ingredient findIngredient(Long ingredientID) {
		return manager.find(Ingredient.class, ingredientID);
	}

}
