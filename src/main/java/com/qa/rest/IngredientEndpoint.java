package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.qa.business.service.IngredientService;

@Path("/ingredient")
public class IngredientEndpoint {
	@Inject
	private IngredientService service;

	@Path("/json")
	@GET
	public String getIngredient(String ingredient) {
		return service.getIngredient(ingredient);
	}

	@Path("/json")
	@POST
	public String createIngredient(String ingredient) {
		return service.createIngredient(ingredient);
	}

	@Path("/json")
	@DELETE
	public String deleteIngredient(String ingredient) {
		return service.deleteIngredient(ingredient);
	}

	@Path("/json")
	@PUT
	public String updateIngredient(String ingredient) {
		return service.updateIngredient(ingredient);
	}

	public void setService(IngredientService service) {
		this.service = service;
	}
}
