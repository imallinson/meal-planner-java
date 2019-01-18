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

	

	public void setService(RecipeService service) {
		this.service = service;
	}
}
