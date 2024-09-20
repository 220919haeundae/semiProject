package com.h2.chuizone.common.board.model.service;

import java.util.List;

import com.h2.chuizone.category.model.dto.SelectCategoryBoardListDto;
import com.h2.chuizone.common.board.model.vo.Board;

public interface BoardService {
	int insertBoard(Board board);
	
	List<SelectCategoryBoardListDto> selectCategoryBoardList(int startNum, int endNum);
	
	public SelectCategoryBoardListDto selectCategoryBoard(int boardId);
	
	int deleteCategoryBoard(int boardNo);
	
	int updateBoard(int boardNo, String content, String title);
}
