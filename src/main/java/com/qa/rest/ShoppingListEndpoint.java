package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.qa.business.service.ShoppingListService;

@Path("/list")
public class ShoppingListEndpoint {
	@Inject
	private ShoppingListService service;
	
	@Path("/get/{username}")
	@GET
	public String getShoppingList(@PathParam("username") String username) {
		return service.getShoppingList(username);
	}
	
	@Path("/meal")
	@POST
	public String addMeal(String mealJSON) {
		return service.addMeal(mealJSON);
	}
	
	@Path("/ingredient")
	@POST
	public String addIngredient(String ingredientJSON) {
		return service.addIngredient(ingredientJSON);
	}
	
	@Path("/ingredient")
	@DELETE
	public String deleteIngredient(String ingredientJSON) {
		return service.deleteIngredient(ingredientJSON);
	}
	
	@Path("/ingredient")
	@PUT
	public String updateIngredient(String ingredientJSON) {
		return service.updateIngredient(ingredientJSON);
	}
	
	@Path("/clear/{username}")
	@DELETE
	public String clearShoppingList(@PathParam("username") String username) {
		return service.clearShoppingList(username);
	}
	
	public void setService(ShoppingListService service) {
		this.service = service;
	}
}
