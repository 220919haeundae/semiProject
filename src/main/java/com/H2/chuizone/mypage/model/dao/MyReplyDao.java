package com.H2.chuizone.mypage.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.vo.MyReply;
import com.H2.chuizone.template.PageInfo;

public class MyReplyDao {

	public int selectMyReplyCount(SqlSession sqlSession, String userNo) {
		
		return sqlSession.selectOne("boardMapper.selectMyReplyCount", userNo);
	}
	
	public ArrayList<MyReply> selectMyReply(SqlSession sqlSession, PageInfo pi, String userNo) {
		
		int offset = (pi.getCurrentPage()-1)*pi.getBoardLimit();
		
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("boardMapper.myReply", userNo, rowBounds);
	}

	
	
}
