package com.h2.chuizone.category.model.service;

import com.h2.chuizone.category.model.vo.CategoryBoard;
import com.h2.chuizone.common.board.model.vo.Board;

public interface CategoryBoardService {
	int selectMaxPageNumber();
	
	int insertCategoryBoard(CategoryBoard categoryBoard, Board board, int userNo);
	
	int updateCategoryBoardByCurCount(int currentHeadCnt, int boardNo);
	
	int updateCategoryBoardByView(int view, int boardNo);

	int updateCategoryBoardByRecommandPlus(int categoryNo);

	int updateCategoryBoardByRecommandMinus(int categoryNo);

	int updateCategoryBoardByComplainPlus(int categoryNo);

	int updateCategoryBoardByComplainMinus(int categoryNo);
	
	int updateCategoryBoard(int categoryBoardNo, int smallGroupCategoryNo, String categoryImage, int maxCount);
}
