package com.bancos.sample.CausAhorroWs.Model.enums;

public enum RegistryType {
	PNATURAL("Persona Natural"), PJURIDICA("Persona Juridica");
	
	String detalle;
	
	RegistryType(String detalle){
		this.detalle = detalle;
	}

	public String getDetalle() {
		return detalle;
	}
	
}
