package com.h2.chuizone.homepage.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.h2.chuizone.common.review.model.vo.Review;

public class BestReviewDao {

	public ArrayList<Review> bestReview(SqlSession sqlSession) {
		return (ArrayList)sqlSession.selectList("reviewMapper.bestReview");
	}

}
