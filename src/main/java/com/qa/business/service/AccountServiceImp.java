package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.JSONUtil;

public class AccountServiceImp implements AccountService {
	@Inject
	private AccountRepository repo;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public boolean checkAccount(String accountJSON) {
		Account account = util.getObjectForJSON(accountJSON, Account.class);
		return repo.checkAccount(account);
	}

	@Override
	public String createAccount(String accountJSON) {
		Account account = util.getObjectForJSON(accountJSON, Account.class);
		return repo.createAccount(account);
	}

}
