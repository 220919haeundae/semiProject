package com.h2.chuizone.homepage.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.category.model.dto.SelectCategoryBoardListDto;
import com.h2.chuizone.homepage.model.dao.BestClubDao;
import com.h2.chuizone.template.MybatisTemplate;

public class BestClubService {
	SqlSession sqlSession = MybatisTemplate.getSqlSession();

	public List<SelectCategoryBoardListDto> bestClub() {
		System.out.println("service test");

		return new BestClubDao().bestClub(sqlSession);
	}

}
