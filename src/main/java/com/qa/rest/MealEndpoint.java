package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.qa.business.service.MealService;

@Path("/meal")
public class MealEndpoint {
	@Inject
	private MealService service;

	@Path("/get/{id}")
	@GET
	public String getMeal(@PathParam("id") Long mealID) {
		return service.getMeal(mealID);
	}
	
	@Path("/create")
	@POST
	public String createMeal(String mealJSON) {
		return service.createMeal(mealJSON);
	}
	
	@Path("/delete/{id}")
	@DELETE
	public String deleteMeal(@PathParam("id") Long mealID) {
		return service.deleteMeal(mealID);
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
