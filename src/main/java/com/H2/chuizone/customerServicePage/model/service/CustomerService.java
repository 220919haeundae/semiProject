package com.h2.chuizone.customerServicePage.model.service;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.customerServicePage.model.dao.CustomerServiceDao;
import com.h2.chuizone.customerServicePage.model.vo.Board;
import com.h2.chuizone.template.MybatisTemplate;

public class CustomerService {

	public int insertInquiryBoard(Board b) {
		int result = 0;
		
		SqlSession sqlSession = MybatisTemplate.getSqlSession();
		result = new CustomerServiceDao().insertInquiryBoard(sqlSession, b);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}

}
