package com.H2.chuizone.mypage.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.vo.MyReply;

public class MyReplyDao {

	public List<MyReply> selectMyReply(SqlSession sqlSession, String memberNo) {
		
		return sqlSession.selectList("boardMapper.myReply", memberNo);
		
	}
	
}
