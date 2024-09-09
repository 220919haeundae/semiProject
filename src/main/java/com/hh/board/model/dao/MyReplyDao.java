package com.hh.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hh.board.model.vo.MyReply;

public class MyReplyDao {

	public List<MyReply> selectMyReply(SqlSession sqlSession, String memberNo) {
		
		return sqlSession.selectList("boardMapper.myReply", memberNo);
		
	}
	
}
