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

	@Path("/get")
	@GET
	public String getMeal(String mealJSON) {
		return service.getMeal(mealJSON);
	}
	
	@Path("/create")
	@POST
	public String createMeal(String mealJSON) {
		return service.createMeal(mealJSON);
	}
	
	@Path("/delete")
	@DELETE
	public String deleteMeal(String mealJSON) {
		return service.deleteMeal(mealJSON);
	}
	
	@Path("/update")
	@PUT
	public String updateMeal(String mealJSON) {
		return service.updateMeal(mealJSON);
	}

	public void setService(MealService service) {
		this.service = service;
	}
}
