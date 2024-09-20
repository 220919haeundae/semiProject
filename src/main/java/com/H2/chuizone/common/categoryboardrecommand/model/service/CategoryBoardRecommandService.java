package com.h2.chuizone.common.categoryboardrecommand.model.service;

import com.h2.chuizone.common.categoryboardrecommand.model.vo.CategoryBoardRecommand;

public interface CategoryBoardRecommandService {
	int selectCategoryBoardRecommand();
	
	int selectCategoryBoardRecommandByUserNo(int categoryNo, int memberNo);
	
	int insertCategoryBoardRecommand(CategoryBoardRecommand categoryBoardRecommand);
	
	int deleteCategoryBoardRecommand(int categoryNo, int memberNo);
}
