package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class ShoppingList {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long shoppingListID;
	@OneToOne(mappedBy="username", cascade=CascadeType.PERSIST)
	private Account account;
	@OneToMany(mappedBy="shoppingListID", cascade=CascadeType.PERSIST)
	private List<Ingredient> ingredients;

	public Long getShoppingListID() {
		return shoppingListID;
	}

	public Account getAccount() {
		return account;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
}
