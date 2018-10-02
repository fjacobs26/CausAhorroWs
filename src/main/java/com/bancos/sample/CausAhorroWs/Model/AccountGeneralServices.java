package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "transaction")
@Entity
@SuppressWarnings("serial")
public class AccountGeneralServices implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "companyCode")
	private String companyCode;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "country")
	private String country;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Category category;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Category subCategory;

	public AccountGeneralServices(Long id, String companyCode, String address, String country, Category category,
			Category subCategory) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.address = address;
		this.country = country;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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