package com.bancos.sample.CausAhorroWs.Model.enums;

public enum TransactionType {
	CONSOLIDATED		("Pago Consolidado"),
    PENDING				("Pago Pendiente");
    
    String transactionType;
    
    TransactionType(String transactionType){
    	this.transactionType = transactionType;
    }

}
