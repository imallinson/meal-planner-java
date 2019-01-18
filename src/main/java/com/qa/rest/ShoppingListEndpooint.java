package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.qa.business.service.AccountService;
import com.qa.business.service.ShoppingListService;

@Path("/recipe")
public class ShoppingListEndpooint {
	@Inject
	private ShoppingListService service;
	
	
	
	public void setService(AccountService service) {
		this.service = service;
	}
}
