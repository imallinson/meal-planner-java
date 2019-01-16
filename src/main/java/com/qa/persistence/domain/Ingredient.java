package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Ingredient {
	@Id
	private String ingredientName;
	private boolean isVegitarian;
	private boolean isVegan;
	private boolean hasGluten;
	private boolean hasNuts;

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public boolean isVegitarian() {
		return isVegitarian;
	}

	public void setVegitarian(boolean isVegitarian) {
		this.isVegitarian = isVegitarian;
	}

	public boolean isVegan() {
		return isVegan;
	}

	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}

	public boolean isHasGluten() {
		return hasGluten;
	}

	public void setHasGluten(boolean hasGluten) {
		this.hasGluten = hasGluten;
	}

	public boolean isHasNuts() {
		return hasNuts;
	}

	public void setHasNuts(boolean hasNuts) {
		this.hasNuts = hasNuts;
	}

}
