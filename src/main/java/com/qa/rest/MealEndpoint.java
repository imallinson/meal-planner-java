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
	public String getAccount(String account) {
		return service.getAccount(account);
	}

	@Path("/json")
	@POST
	public String createAccount(String account) {
		return service.createAccount(account);
	}

	@Path("/json")
	@DELETE
	public String deleteAccount(String account) {
		return service.deleteAccount(account);
	}

	@Path("/json")
	@PUT
	public String updateAccount(String account) {
		return service.updateAccount(account);
	}

	public void setService(MealService service) {
		this.service = service;
	}
}
