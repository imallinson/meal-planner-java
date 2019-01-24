package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class ShoppingList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shoppingListID;
	@OneToOne(cascade=CascadeType.PERSIST)
	@MapsId
	private Account account;
	@OneToMany(mappedBy="shoppingListID", cascade=CascadeType.PERSIST)
	private List<Ingredient> ingredients = null;
	
	public ShoppingList() {
		
	}
	
	public ShoppingList(Account account) {
		this.account = account;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
}
