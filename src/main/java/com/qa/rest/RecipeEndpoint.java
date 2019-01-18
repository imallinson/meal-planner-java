package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.qa.business.service.RecipeService;

@Path("/recipe")
public class RecipeEndpoint {
	@Inject
	private RecipeService service;

	@Path("/get")
	@GET
	public String getRecipe(String recipeJSON) {
		return service.getRecipe(recipeJSON);
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

	public void setService(RecipeService service) {
		this.service = service;
	}
}
