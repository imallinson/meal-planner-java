package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class AccountDBRepository implements AccountRepository {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	public String getAccount(Account account) {
		Query query = manager.createQuery("SELECT a FROM Account a WHERE userName = " + account.getUsername());
		Account foundAccount = (Account) query.getSingleResult();
		return util.getJSONForObject(foundAccount);
	}

	@Override
	public String createAccount(Account account) {
		
		return null;
	}

	@Override
	public String deleteAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
