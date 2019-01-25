package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.qa.business.service.RecipeService;

@Path("/recipe")
public class RecipeEndpoint {
	@Inject
	private RecipeService service;

	@Path("/get/{id}")
	@GET
	public String getRecipe(@PathParam("id") Long recipeID) {
		return service.getRecipe(recipeID);
	}
	
	@Path("/user/{username}")
	@GET
	public String getUsersRecipe(@PathParam("username") String username) {
		return service.getUsersRecipe(username);
	}
	
	@Path("/search/{searchString}")
	@GET
	public String searchRecipes(@PathParam("searchString") String searchString) {
		return service.searchRecipes(searchString);
	}
	
	@Path("/create")
	@POST
	public String createRecipe(String recipeJSON) {
		return service.createRecipe(recipeJSON);
	}
	
	@Path("/delete")
	@DELETE
	public String deleteRecipe(String recipeJSON) {
		return service.deleteRecipe(recipeJSON);
	}
	
	@Path("/update")
	@PUT
	public String updateRecipe(String recipeJSON) {
		return service.updateRecipe(recipeJSON);
	}
	
	@Path("/ingredient")
	@POST
	public String addIngredient(String ingredientJSON) {
		return service.addIngredient(ingredientJSON);
	}
	
	@Path("/ingredient")
	@DELETE
	public String deleteIngredient(String ingredientJSON) {
		return service.deleteIngredient(ingredientJSON);
	}
	
	@Path("/ingredient")
	@PUT
	public String updateIngredient(String ingredientJSON) {
		return service.updateIngredient(ingredientJSON);
	}

	public void setService(RecipeService service) {
		this.service = service;
	}
}
