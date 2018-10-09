package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;
import com.bancos.sample.CausAhorroWs.Model.Account;

public interface AccountService {
	public List<Account> findAll();
	public void save(Account account);
}
