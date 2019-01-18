package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.qa.business.service.AccountService;

@Path("/account")
public class AccountEndpoint {
	@Inject
	private AccountService service;

	

	public void setService(AccountService service) {
		this.service = service;
	}
}
