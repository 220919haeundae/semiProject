package com.H2.chuizone.mypage.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.vo.MySocial;


public class MySocialDao {
	
public List<MySocial> selectMySocial(SqlSession sqlSession, String memberNo) {
		
		return sqlSession.selectList("boardMapper.mySocial", memberNo);
		
	}

}
