package com.bancos.sample.CausAhorroWs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bancos.sample.CausAhorroWs.Model.Category;
import com.bancos.sample.CausAhorroWs.Repository.CategoryRepository;

@Service("categoryServiceImpl")
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	@Qualifier("categoryRepository")
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getByCategory() {
		return categoryRepository.getMainCategory();
	}

	@Override
	public List<Category> getBySubCategory() {
		return categoryRepository.getSubCategory();
	}

}
