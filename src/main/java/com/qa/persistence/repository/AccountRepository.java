package com.qa.persistence.repository;

import com.qa.persistence.domain.Account;

public interface AccountRepository {
	String getAccount(Account account);

	String createAccount(Account account);

	String deleteAccount(Account account);
	
	String updateAccount(Account account);
}
