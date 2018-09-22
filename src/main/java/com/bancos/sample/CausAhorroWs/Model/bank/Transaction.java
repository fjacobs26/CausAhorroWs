package com.bancos.sample.CausAhorroWs.Model.bank;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
	private Date transactionDate;//hora y fecha exacta
	private BigDecimal amount;
	private TransactionType transactionType;
	
	public Transaction(Date transactionDate, BigDecimal amount, TransactionType transactionType) {
		super();
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	
	
}
