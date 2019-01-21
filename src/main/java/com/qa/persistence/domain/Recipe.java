package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recipeID;
	private boolean isPublic;
	private String recipeName;
	private int servings;
	@OneToMany(mappedBy="recipeID", cascade=CascadeType.PERSIST)
	private List<Ingredient> ingredients;
	private String username;

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public Long getRecipeID() {
		return recipeID;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public String getUsername() {
		return username;
	}
	
}
