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
	
	@Path("/get/{id}")
	@GET
	public String getShoppingList(@PathParam("id") Long accountID) {
		return service.getShoppingList(accountID);
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
	
	@Path("/ingredient/{id}")
	@DELETE
	public String deleteIngredient(@PathParam("id") Long ingredientID) {
		return service.deleteIngredient(ingredientID);
	}
	
	@Path("/ingredient")
	@PUT
	public String updateIngredient(String ingredientJSON) {
		return service.updateIngredient(ingredientJSON);
	}
	
	@Path("/clear/{id}")
	@DELETE
	public String clearShoppingList(@PathParam("id") Long accountID) {
		return service.clearShoppingList(accountID);
	}
	
	public void setService(ShoppingListService service) {
		this.service = service;
	}
}
