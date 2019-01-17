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
	public String getAccount(String account) {
		return service.getIngredient(account);
	}

	@Path("/json")
	@POST
	public String createAccount(String account) {
		return service.createIngredient(account);
	}

	@Path("/json")
	@DELETE
	public String deleteAccount(String account) {
		return service.deleteIngredient(account);
	}

	@Path("/json")
	@PUT
	public String updateAccount(String account) {
		return service.updateIngredient(account);
	}

	public void setService(IngredientService service) {
		this.service = service;
	}
}
