package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "client")
@SuppressWarnings("serial")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Client implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long idClient;

	@Email
	@NotBlank
	@Size(max = 50)
	protected String username;

	@NotBlank
	@Size(max = 64)
	protected String password;

	@OneToOne(fetch = FetchType.LAZY)
	private Address address;

	@OneToMany(mappedBy = "client")
	private Set<Transaction> transactions;

	public Client() {
	}

	public Client(String username, String password, Address address, Set<Transaction> transactions) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.transactions = transactions;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
}