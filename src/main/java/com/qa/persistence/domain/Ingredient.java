package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ingredientID;
	private String ingredientName;
	private Double amount;
	private Measurement measure;
	private Long recipeID;
	private Long shoppingListID;

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Measurement getMeasure() {
		return measure;
	}

	public void setMeasure(Measurement measure) {
		this.measure = measure;
	}

	public Long getIngredientID() {
		return ingredientID;
	}

	public Long getRecipeID() {
		return recipeID;
	}

	public Long getShoppingListID() {
		return shoppingListID;
	}

}
