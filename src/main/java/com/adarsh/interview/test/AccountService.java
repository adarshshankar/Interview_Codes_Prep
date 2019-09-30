package com.adarsh.interview.test;

import java.util.List;

/**
 * @author Adarsh Shankar
 *
 */
public interface AccountService {
	AccountEntity createAccount(AccountEntity accountEntity);

	AccountEntity findAccount(Long accountNumber);

	List<AccountEntity> findAllAccounts();

	void deleteAccount(Long accountNumber);
}
