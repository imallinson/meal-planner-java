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

	

	public void setService(IngredientService service) {
		this.service = service;
	}
}
