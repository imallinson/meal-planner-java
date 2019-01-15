package com.qa.persistence.domain;

public class Recipe {
	private int recipeID;
	private boolean isPublic;
	private String recipeName;

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

	public int getRecipeID() {
		return recipeID;
	}

}
