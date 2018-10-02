package com.bancos.sample.CausAhorroWs.Model.enums;

public enum MoneyValues {
	DOLAR		("Dolares"),
	SOLES		("Soles");
	
	private String coins;
	
	MoneyValues(String coins){
		this.coins = coins;
	}
	
}
