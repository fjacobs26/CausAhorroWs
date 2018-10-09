package com.bancos.sample.CausAhorroWs.Service;

import java.math.BigDecimal;
import java.util.List;

import com.bancos.sample.CausAhorroWs.Model.Transaction;

public interface TransactionService {
	
	public List<Transaction> findAll();
	public boolean save(Transaction transaction);
	public BigDecimal getRetention();
}
