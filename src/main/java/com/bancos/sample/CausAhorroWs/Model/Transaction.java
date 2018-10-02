package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.bancos.sample.CausAhorroWs.Model.enums.TransactionType;

@Table(name="transaction")
@Entity
@SuppressWarnings("serial")
public class Transaction implements Serializable {
	@Id
	@Size(max=100)
	@Column(name="id_transaction")
	private String idTransaction;
	
	@Column(name="date_transaction")
	private Date dateTransaction;
	
	@Column(name="amount")
	private BigDecimal amount;
	
	@Column(name="currency")
	private String currency;//MoneyValues
	
	@Column(name="concept")
	private String concept;
	
	@Column(name="isVirtualTpv")
	private boolean isVirtualTpv;
	
	@Column(name="transaction_type")
	private String transactionType;
		
	@OneToOne(fetch = FetchType.LAZY)
	private AccountGeneralServices accountServices;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Category category;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Category subCategory;
	
	@Column(name="note")
	private String note;

	public Transaction(String idTransaction, Date dateTransaction, BigDecimal amount, String currency, String concept,
			boolean isVirtualTpv, String transactionType, AccountGeneralServices accountServices,
			Category category, Category subCategory, String note) {
		super();
		this.idTransaction = idTransaction;
		this.dateTransaction = dateTransaction;
		this.amount = amount;
		this.currency = currency;
		this.concept = concept;
		this.isVirtualTpv = isVirtualTpv;
		this.transactionType = transactionType;
		this.accountServices = accountServices;
		this.category = category;
		this.subCategory = subCategory;
		this.note = note;
	}

	public String getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(String idTransaction) {
		this.idTransaction = idTransaction;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(Category subCategory) {
		this.subCategory = subCategory;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}