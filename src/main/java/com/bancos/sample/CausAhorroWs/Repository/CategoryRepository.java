package com.bancos.sample.CausAhorroWs.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bancos.sample.CausAhorroWs.Model.Category;
@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long>{
	@Query("select c from Category c where c.isSubCategory is false")
	public List<Category> getMainCategory();
	
	@Query("select c from Category c where c.isSubCategory is true")
	public List<Category> getSubCategory();
}
