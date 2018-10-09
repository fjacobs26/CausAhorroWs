package com.bancos.sample.CausAhorroWs.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bancos.sample.CausAhorroWs.Model.Transaction;
import com.bancos.sample.CausAhorroWs.Repository.AccountReposiroty;
import com.bancos.sample.CausAhorroWs.Repository.TransactionRepository;
@Service("transactionServiceImpl")
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	@Qualifier("transactionRepository")
	private TransactionRepository transactionRepository;
	
	@Autowired
	@Qualifier("accountRepository")
	private AccountReposiroty accountReposiroty;
	
	@Override
	public List<Transaction> findAll() {
		return transactionRepository.findAll();
	}

	@Override
	public boolean save(Transaction transaction) {
		try {
			transactionRepository.save(transaction);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public BigDecimal getRetention() {
		return accountReposiroty.getRetention();
	}

}
