package com.H2.chuizone.customerServicePage.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.customerServicePage.model.vo.Board;

public class CustomerServiceDao {

	public int insertInquiryBoard(SqlSession sqlSession, Board b) {
		
		
		return sqlSession.insert("boardMapper.insertInquiryBoard", b);
	}

}
