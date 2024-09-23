package com.h2.chuizone.customerServicePage.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.customerServicePage.model.dao.CustomerServiceDao;
import com.h2.chuizone.customerServicePage.model.vo.Board;
import com.h2.chuizone.template.MybatisTemplate;

public class CustomerService {

	public int insertInquiryBoard(Board b, Board b1) {
		int result = 0;
		
		SqlSession sqlSession = MybatisTemplate.getSqlSession();
		result = new CustomerServiceDao().insertInquiryBoard(sqlSession, b, b1);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}


	public ArrayList<Board> selectInquiryList(String userNo) {
		SqlSession sqlSession = MybatisTemplate.getSqlSession();
		
		return new CustomerServiceDao().selectInquiryList(sqlSession, userNo);
	}

}
