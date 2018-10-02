package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Table(name = "account")
@Entity
@SuppressWarnings("serial")
public class Account implements Serializable {
	@GeneratedValue
	@Id
	@Size(max=100)
	@Column(name = "id_account")
	private String idAccount;

	@Column(name = "registry_type")
	private String registryType;

	@Column(name = "registry_code")
	private String registryCode;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "coinType")
	private String coinType;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "balance")
	private BigDecimal actualBalance;

	@Column(name = "retention")
	private BigDecimal actualRetention;

	public Account(String idAccount, String registryType, String registryCode, String accountNumber, String coinType,
			String accountType, BigDecimal actualBalance, BigDecimal actualRetention) {
		super();
		this.idAccount = idAccount;
		this.registryType = registryType;
		this.registryCode = registryCode;
		this.accountNumber = accountNumber;
		this.coinType = coinType;
		this.accountType = accountType;
		this.actualBalance = actualBalance;
		this.actualRetention = actualRetention;
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount= idAccount;
	}

	public String getRegistryType() {
		return registryType;
	}

	public void setRegistryType(String registryType) {
		this.registryType = registryType;
	}

	public String getRegistryCode() {
		return registryCode;
	}

	public void setRegistryCode(String registryCode) {
		this.registryCode = registryCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCoinType() {
		return coinType;
	}

	public void setCoinType(String coinType) {
		this.coinType = coinType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getActualBalance() {
		return actualBalance;
	}

	public void setActualBalance(BigDecimal actualBalance) {
		this.actualBalance = actualBalance;
	}

	public BigDecimal getActualRetention() {
		return actualRetention;
	}

	public void setActualRetention(BigDecimal actualRetention) {
		this.actualRetention = actualRetention;
	}

}
