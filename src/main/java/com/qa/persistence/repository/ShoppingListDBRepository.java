package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account; 
import com.qa.persistence.domain.Ingredient;
import com.qa.persistence.domain.Meal;
import com.qa.persistence.domain.ShoppingList;

@Transactional(SUPPORTS)
public class ShoppingListDBRepository implements ShoppingListRepository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Override
	public ShoppingList getShoppingList(Account account) {
		return findShoppingList(account.getUsername());
	}

	@Override
	@Transactional(REQUIRED)
	public String addMeal(Meal meal) {
		List<Ingredient> ingredients = meal.getRecipe().getIngredients();
		ingredients.stream().forEach(i -> manager.persist(i));
		return "{\"message\": \"meal added to shopping list\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String addIngredient(Ingredient ingredient) {
		manager.persist(ingredient);
		return "{\"message\": \"ingredient added to shopping list\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String deleteIngredient(Ingredient ingredient) {
		manager.remove(ingredient);
		return "{\"message\": \"ingredient succesfully removed\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String updateIngredient(Ingredient ingredient) {
		Ingredient ingredientInDB = findIngredient(ingredient.getIngredientID());
		manager.remove(ingredientInDB);
		manager.persist(ingredient);
		return "{\"message\": \"ingredient succesfully updated\"}";
	}

	@Override
	@Transactional(REQUIRED)
	public String clearShoppingList(String username) {
		ShoppingList shoppingListInDB = findShoppingList(username);
		shoppingListInDB.getIngredients().stream().forEach(i -> manager.remove(i));
		return "{\"message\": \"shopping list cleared\"}";
	}
	
	private ShoppingList findShoppingList(String username) {
		return manager.find(ShoppingList.class, username);
	}
	
	private Ingredient findIngredient(Long ingredientID) {
		return manager.find(Ingredient.class, ingredientID);
	}

}
