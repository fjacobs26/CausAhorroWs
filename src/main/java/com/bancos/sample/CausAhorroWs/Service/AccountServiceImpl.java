package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bancos.sample.CausAhorroWs.Model.Account;
import com.bancos.sample.CausAhorroWs.Repository.AccountReposiroty;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	@Qualifier("accountRepository")
	private AccountReposiroty accountRepository;
	
	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public void save(Account account) {
		accountRepository.save(account);
	}

}
