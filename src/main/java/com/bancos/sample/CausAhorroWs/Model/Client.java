package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "client")
@Entity
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
	@Column(name="username")
	protected String username;

	@NotBlank
	@Size(max = 64)
	@Column(name="password")
	protected String password;

	@OneToOne(fetch = FetchType.EAGER)
	private Address address;

	public Client() {}

	public Client(String username, String password, Address address) {
		this.username = username;
		this.password = password;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getIdClient() {
		return idClient;
	}
}