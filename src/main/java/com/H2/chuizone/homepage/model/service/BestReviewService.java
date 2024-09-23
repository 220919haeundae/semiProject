package com.h2.chuizone.homepage.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.common.review.model.vo.Review;
import com.h2.chuizone.homepage.model.dao.BestReviewDao;
import com.h2.chuizone.template.MybatisTemplate;

public class BestReviewService {
	
	BestReviewDao brDao = new BestReviewDao();

	public ArrayList<Review> bestReview() {
		SqlSession sqlSession = MybatisTemplate.getSqlSession();
		
		return brDao.bestReview(sqlSession);
	}

}
