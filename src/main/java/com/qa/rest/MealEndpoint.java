package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.qa.business.service.MealService;

@Path("/meal")
public class MealEndpoint {
	@Inject
	private MealService service;

	

	public void setService(MealService service) {
		this.service = service;
	}
}
