package com.bancos.sample.CausAhorroWs.Model.enums;

public enum MoneyValues {
	DOLAR		("Dolares"),
	SOLES		("Soles");
	
	private String detalle;
	
	MoneyValues(String detalle){
		this.detalle = detalle;
	}

	public String getDetalle() {
		return detalle;
	}
}
