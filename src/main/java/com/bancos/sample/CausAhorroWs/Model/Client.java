package com.bancos.sample.CausAhorroWs.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="client")
@Entity
public class Client {
	@GeneratedValue
	@Id
	@Column(name="id_client")
	private Long idClient;
	
	@Column(name="account")
	private Account account;
	
	@Column(name="transaction")
	private Transaction transaction;
	
	public Client(Long idClient, Account account, Transaction transaction) {
		this.idClient = idClient;
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
