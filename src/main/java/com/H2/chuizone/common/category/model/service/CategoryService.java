package com.h2.chuizone.common.category.model.service;

import java.util.List;

import com.h2.chuizone.common.category.model.vo.Category;

public interface CategoryService {
	List<Category> selectCategoryList();
	
	Category selectCategory(String categoryName);
}
