package com.qa.business.service;

public interface AccountService {
	public String getAccount(String accountJSON);

	public String createAccount(String accountJSON);

	public String deleteAccount(String accountJSON);
	
	public String updateAccount(String accountJSON);
}