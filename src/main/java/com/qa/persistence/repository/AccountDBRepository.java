package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;

@Transactional(SUPPORTS)
public class AccountDBRepository implements AccountRepository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Override
	public boolean checkAccount(Account account) {
		Account accountInDB = findAccount(account.getUsername());
		if (account.getPassword().equals(accountInDB.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	@Transactional(REQUIRED)
	public String createAccount(Account account) {
		Account accountInDB = findAccount(account.getUsername());
		if (accountInDB == null) {
			manager.persist(account);
			return "{\"message\": \"account sucessfully created\"}";
		}
		return "{\"message\": \"account with that username already exists\"}";
	}
	
	private Account findAccount(String username) {
		return manager.find(Account.class, username);
	}

}
