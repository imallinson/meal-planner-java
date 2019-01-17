package com.qa.business.service;

public interface AccountService {
	public String getAllAccounts(String accountJSON);

	public String createAccount(String accountJSON);

	public String deleteAccount(String accountJSON);
	
	public String updateAccount(String accountJSON);
}
