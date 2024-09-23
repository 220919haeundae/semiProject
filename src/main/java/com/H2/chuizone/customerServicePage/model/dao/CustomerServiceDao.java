package com.h2.chuizone.customerServicePage.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.customerServicePage.model.vo.Board;
import com.h2.chuizone.customerServicePage.model.vo.InquiryBoard;
import com.h2.chuizone.template.PageInfo;

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

	public int inquiryListCount(SqlSession sqlSession, String userNo) {
		return sqlSession.selectOne("boardMapper.inquiryListCount", userNo);
	}

	public ArrayList<Board> selectInquiryList(SqlSession sqlSession, PageInfo pi, String userNo) {
		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlSession.selectList("boardMapper.selectInquiryList", userNo, rowBounds);
	}
	
	



	public Board selectInquiry(SqlSession sqlSession, String userNo, String boardNo) {
		Map<String, String> map = new HashMap<>();
		System.out.println(userNo);
		System.out.println(boardNo);
		map.put("userNo", userNo);
		map.put("boardNo", boardNo);
		return sqlSession.selectOne("boardMapper.selectInquiry", map);
	}

	

}
