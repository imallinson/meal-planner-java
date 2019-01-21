package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

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

	@Override
	@Transactional(REQUIRED)
	public String clearShoppingList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ShoppingList findShoppingList(String username) {
		return manager.find(ShoppingList.class, username);
	}
	
	private Meal findMeal(Long mealID) {
		return manager.find(Meal.class, mealID);
	}
	
	private Ingredient findIngredient(Long ingredientID) {
		return manager.find(Ingredient.class, ingredientID);
	}

}
