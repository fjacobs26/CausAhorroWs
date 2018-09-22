package com.bancos.sample.CausAhorroWs.Model.bank;

public class TransactionType {
	private Long idTransactionType;
	private String nameTransaction;//Internet, pago corriente, pago programado
	
	public TransactionType(Long idTransactionType, String nameTransaction) {
		super();
		this.idTransactionType = idTransactionType;
		this.nameTransaction = nameTransaction;
	}
	public Long getIdTransactionType() {
		return idTransactionType;
	}
	public void setIdTransactionType(Long idTransactionType) {
		this.idTransactionType = idTransactionType;
	}
	public String getNameTransaction() {
		return nameTransaction;
	}
	public void setNameTransaction(String nameTransaction) {
		this.nameTransaction = nameTransaction;
	}
	
	
}
