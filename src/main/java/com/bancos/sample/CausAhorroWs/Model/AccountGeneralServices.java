package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "services")
@SuppressWarnings("serial")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AccountGeneralServices implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "companyCode")
	private String companyCode;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Address address;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Category category;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Category subCategory;

	public AccountGeneralServices(){}
	
	public AccountGeneralServices(String companyCode, Address address, Category category,
			Category subCategory) {
		this.companyCode = companyCode;
		this.address = address;
		this.category = category;
		this.subCategory = subCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(Category subCategory) {
		this.subCategory = subCategory;
	}
}