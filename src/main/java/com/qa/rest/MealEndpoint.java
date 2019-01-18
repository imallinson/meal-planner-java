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

	@Path("/json")
	@GET
	public String getMeal(String meal) {
		return service.getMeal(meal);
	}

	@Path("/json")
	@POST
	public String createMeal(String meal) {
		return service.createMeal(meal);
	}

	@Path("/json")
	@DELETE
	public String deleteMeal(String meal) {
		return service.deleteMeal(meal);
	}

	@Path("/json")
	@PUT
	public String updateMeal(String meal) {
		return service.updateMeal(meal);
	}

	public void setService(MealService service) {
		this.service = service;
	}
}
