package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Recipe;

@Transactional(SUPPORTS)
public class RecipeDBRepository implements RecipeRepository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Override
	public Recipe getRecipe(Recipe recipe) {
		return findRecipe(recipe.getRecipeID());
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
		
		return null;
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(REQUIRED)
	public String updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(REQUIRED)
	public String addIngredient(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteIngredient(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(REQUIRED)
	public String updateIngredient(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Recipe findRecipe(Long recipeID) {
		return manager.find(Recipe.class, recipeID);
	}

}
