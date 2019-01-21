package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class ShoppingList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shoppingListID;
	@OneToOne(mappedBy="username", cascade=CascadeType.PERSIST)
	private Account account;
	@OneToMany(mappedBy="shoppingListID", cascade=CascadeType.PERSIST)
	private List<Ingredient> ingredients;

	public Account getAccount() {
		return account;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
}
