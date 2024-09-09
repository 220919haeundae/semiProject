package com.hh.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hh.board.model.vo.MySocial;

public class MySocialDao {
	
public List<MySocial> selectMySocial(SqlSession sqlSession, String memberNo) {
		
		return sqlSession.selectList("boardMapper.mySocial", memberNo);
		
	}

}
