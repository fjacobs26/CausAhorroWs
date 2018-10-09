package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "transaction")
@SuppressWarnings("serial")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transaction implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTransaction;

	@Column(name = "date_transaction")
	private Date dateTransaction;

	@Column(name = "amount")
	private BigDecimal amount;

	@Column(name = "currency")
	private String currency;// MoneyValues

	@Column(name = "concept")
	private String concept;

	@Column(name = "isVirtualTpv")
	private boolean isVirtualTpv;

	@Column(name = "transaction_type")
	private String transactionType;

	@OneToOne(fetch = FetchType.LAZY)
	private AccountGeneralServices accountServices;

	@Column(name = "note")
	private String note;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Account account;

	@ManyToOne(fetch=FetchType.LAZY)
	private Client client;
	
	public Transaction(Date dateTransaction, BigDecimal amount, String currency, String concept,
			boolean isVirtualTpv, String transactionType, AccountGeneralServices accountServices, 
			String note, Account account, Client client) {
		this.dateTransaction = dateTransaction;
		this.amount = amount;
		this.currency = currency;
		this.concept = concept;
		this.isVirtualTpv = isVirtualTpv;
		this.transactionType = transactionType;
		this.accountServices = accountServices;
		this.note = note;
		this.account = account;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public boolean isVirtualTpv() {
		return isVirtualTpv;
	}

	public void setVirtualTpv(boolean isVirtualTpv) {
		this.isVirtualTpv = isVirtualTpv;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public AccountGeneralServices getAccountServices() {
		return accountServices;
	}

	public void setAccountServices(AccountGeneralServices accountServices) {
		this.accountServices = accountServices;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}