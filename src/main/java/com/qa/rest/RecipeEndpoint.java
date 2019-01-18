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

	@Path("/json")
	@GET
	public String getRecipe(String recipe) {
		return service.getRecipe(recipe);
	}

	@Path("/json")
	@POST
	public String createRecipe(String recipe) {
		return service.createRecipe(recipe);
	}

	@Path("/json")
	@DELETE
	public String deleteRecipe(String recipe) {
		return service.deleteRecipe(recipe);
	}

	@Path("/json")
	@PUT
	public String updateRecipe(String recipe) {
		return service.updateRecipe(recipe);
	}

	public void setService(RecipeService service) {
		this.service = service;
	}
}
