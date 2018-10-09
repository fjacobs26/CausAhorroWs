package com.bancos.sample.CausAhorroWs.Model.enums;

public enum BankIdentifier {
	BBVA ("38583"), BCP ("21313"), SCOTIABANK ("43244"), CTRUJILLO ("12315");
	
	public String detalle;
	
	BankIdentifier(String detalle) {
		this.detalle = detalle;
	}

	public String getDetalle() {
		return detalle;
	}	
}
