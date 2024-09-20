package com.h2.chuizone.customerServicePage.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.customerServicePage.model.vo.Board;

public class CustomerServiceDao {

	public int insertInquiryBoard(SqlSession sqlSession, Board b) {
		
		
		return sqlSession.insert("boardMapper.insertInquiryBoard", b);
	}

}
