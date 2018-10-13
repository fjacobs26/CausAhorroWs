package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name="category")
@Entity
@SuppressWarnings("serial")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Category implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="is_sub_category")
	private boolean isSubCategory;
	
	public Category() {}
	
	public Category(String categoryName, boolean isSubCategory) {
		this.categoryName = categoryName;
		this.isSubCategory = isSubCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setSubCategory(boolean isSubCategory) {
		this.isSubCategory = isSubCategory;
	}
}
