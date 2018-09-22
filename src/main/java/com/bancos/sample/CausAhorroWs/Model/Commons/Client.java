package com.bancos.sample.CausAhorroWs.Model.Commons;

import com.bancos.sample.CausAhorroWs.Model.bank.Account;
import com.bancos.sample.CausAhorroWs.Model.bank.Transaction;

public class Client {
	private Long idClient;
	private Account account;
	private Transaction transaction;
	
	public Client(Account account) {
//		this only allow to add a name or registry to the client
		this.account = account;
	}
	public Client(Account account, Transaction transaction) {
		this.account = account;
		this.transaction = transaction;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}	
}
