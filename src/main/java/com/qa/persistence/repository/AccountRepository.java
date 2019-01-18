package com.qa.persistence.repository;

import com.qa.persistence.domain.Account;

public interface AccountRepository {
	
	boolean checkAccount(Account account);

	String createAccount(Account account);
	
}
