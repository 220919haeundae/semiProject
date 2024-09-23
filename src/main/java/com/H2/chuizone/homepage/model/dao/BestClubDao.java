package com.h2.chuizone.homepage.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.category.model.dto.SelectCategoryBoardListDto;

public class BestClubDao {

	public List<SelectCategoryBoardListDto> bestClub(SqlSession sqlSession) {
		System.out.println("daotest");
		return sqlSession.selectList("boardMapper.bestClub");
	}

}
