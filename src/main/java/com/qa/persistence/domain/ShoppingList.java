package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class ShoppingList {
	@OneToOne(cascade = CascadeType.PERSIST)
	@MapsId
	private Account account;
	@OneToMany(mappedBy="shoppingListID", cascade=CascadeType.PERSIST)
	private List<Ingredient> ingredients;

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
