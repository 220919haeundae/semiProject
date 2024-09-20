package com.h2.chuizone.common.categoryboardcomplain.model.service;

import com.h2.chuizone.common.categoryboardcomplain.model.vo.CategoryBoardComplain;

public interface CategoryBoardComplainService {
	int selectCategoryBoardComplain();
	
	int selectCategoryBoardComplainByUserNo(int categoryNo, int memberNo);
	
	int insertCategoryBoardComplain(CategoryBoardComplain categoryBoardRecommand);
	
	int deleteCategoryBoardComplain(int categoryNo, int memberNo);
}
