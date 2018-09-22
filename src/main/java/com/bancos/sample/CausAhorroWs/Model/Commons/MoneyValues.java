package com.bancos.sample.CausAhorroWs.Model.Commons;

public enum MoneyValues {
	DOLAR		("Dolares"),
	EUROS		("Euros"),
	SOLES		("Soles");
	
	private String coins;
	
	MoneyValues(String coins){
		this.coins = coins;
	}
	
}
