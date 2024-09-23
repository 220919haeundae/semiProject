package com.h2.chuizone.customerServicePage.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.customerServicePage.model.vo.Board;
import com.h2.chuizone.customerServicePage.model.vo.InquiryBoard;

public class CustomerServiceDao {

	public int insertInquiryBoard(SqlSession sqlSession, Board b, Board b1) {
		int result = 0;
		System.out.println("1번");
		sqlSession.insert("boardMapper.insertInquiryBoard", b);
		System.out.println("2번");
		sqlSession.insert("boardMapper.insertInqiryBoardUpfile", b1);
		System.out.println("3번");
		
		System.out.println("boardNo : " + b.getBoardNo());
		System.out.println("inquiryNo: " + b1.getInquiryNo());
		
		InquiryBoard ib = new InquiryBoard(b.getBoardNo(), b1.getInquiryNo());
		result = sqlSession.insert("boardMapper.insertInquiryBoardAll", ib);
		return result; 
	}

	

	public ArrayList<Board> selectInquiryList(SqlSession sqlSession, String userNo) {
		return (ArrayList)sqlSession.selectList("boardMapper.selectInquiryList", userNo);
	}

}
