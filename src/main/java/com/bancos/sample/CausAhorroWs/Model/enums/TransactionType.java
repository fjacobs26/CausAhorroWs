package com.bancos.sample.CausAhorroWs.Model.enums;

public enum TransactionType {
	CONSOLIDATED		("Pago Consolidado"),
    PENDING				("Pago Pendiente");
    
    String detalle;
    
    TransactionType(String detalle){
    	this.detalle = detalle;
    }

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
