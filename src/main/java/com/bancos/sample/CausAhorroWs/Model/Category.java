package com.bancos.sample.CausAhorroWs.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="category")
@Entity
@SuppressWarnings("serial")
public class Category implements Serializable{
	@GeneratedValue
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="is_sub_category")
	private boolean isSubCategory;
	
	public Category(Long id, String categoryName, boolean isSubCategory) {
		super();
		this.id = id;
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

	public boolean isSubCategory() {
		return isSubCategory;
	}

	public void setSubCategory(boolean isSubCategory) {
		this.isSubCategory = isSubCategory;
	}
}
