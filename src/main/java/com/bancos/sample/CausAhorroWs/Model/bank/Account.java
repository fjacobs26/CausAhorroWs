package com.bancos.sample.CausAhorroWs.Model.bank;

import java.util.Random;

import com.bancos.sample.CausAhorroWs.Model.Commons.Client;
import com.bancos.sample.CausAhorroWs.Model.Commons.MoneyValues;

public class Account {
	private Long idAccount;
	private Client client;
	private Long registryType;//Persona natural o juridica
	private String registryName;//Nombre de Persona o Mype
	private String coinType;//dolar, sol o euro
	
	public Account(String registryName) {
		this.registryName = registryName;
	}
	
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setRegistryType(Long registryType) {
		this.registryType = registryType;
	}

	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}

	public Long getIdAccount() {
		return new Random().nextLong();
	}

	public Client getClient() {
		return client;
	}

	public Long getRegistryType() {
		return new Random().nextLong();
	}

	public String getRegistryName() {
		return registryName;
	}

	public String getCoinType() {
		return coinType;
	}

	public void setCoinType(String coinType) {
		//only 3 Dolars $, Soles and Euros
		MoneyValues.DOLAR.toString();
		this.coinType = coinType;
	}
	
}