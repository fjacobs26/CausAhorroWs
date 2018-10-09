package com.bancos.sample.CausAhorroWs.Model.enums;

public enum Entailment {
	NOMINA("Nomina"), TARJETA("Tarjeta"), SEGUROS("Seguros"), PENSIONES("Pensiones");

	private String entailment;

	Entailment(String entailment) {
		this.entailment = entailment;
	}

	public String getEntailment() {
		return entailment;
	}

	public void setEntailment(String entailment) {
		this.entailment = entailment;
	}
	
}
