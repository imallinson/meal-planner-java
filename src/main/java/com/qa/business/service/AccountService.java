package com.qa.business.service;

public interface AccountService {

	boolean checkAccount(String accountJSON);

	String createAccount(String accountJSON);

}
