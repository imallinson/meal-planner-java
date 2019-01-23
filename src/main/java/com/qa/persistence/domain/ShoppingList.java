package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class ShoppingList {
	@Id
	private String username;
	@OneToMany(mappedBy="shoppingListID", cascade=CascadeType.PERSIST)
	private List<Ingredient> ingredients;

	public String getUsername() {
		return username;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
}
