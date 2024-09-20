package com.h2.chuizone.common.bookcategory.model.service;

import com.h2.chuizone.common.bookcategory.model.vo.BookCategory;

public interface BookCategoryService {
	int selectBookCategory();
	
	int selectBookCategoryByUserNo(int categoryNo, int memberNo);
	
	int insertBookCategory(BookCategory bookCategory);
	
	int deleteBookCategory(int categoryNo, int memberNo);
}
