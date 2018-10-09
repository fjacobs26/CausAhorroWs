package com.bancos.sample.CausAhorroWs.Model.enums;

public enum AccountType {
	CREDITO ("Credito"), DEBITO("Debito"), WCARD("Wallet Card");
	String detalle;
	AccountType(String detalle){
		this.detalle = detalle;
	}
	public String getDetalle() {
		return detalle;
	}
}
