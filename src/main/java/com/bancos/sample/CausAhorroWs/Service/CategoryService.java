package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;

import com.bancos.sample.CausAhorroWs.Model.Category;

public interface CategoryService {
	public List<Category> getByCategory();
	public List<Category> getBySubCategory();
}
