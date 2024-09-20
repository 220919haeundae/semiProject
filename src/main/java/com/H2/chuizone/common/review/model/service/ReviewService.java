package com.h2.chuizone.common.review.model.service;

import java.util.List;

import com.h2.chuizone.common.review.model.dto.ReviewDto;
import com.h2.chuizone.common.review.model.vo.Review;

public interface ReviewService {
	List<ReviewDto> selectReviewList(int boardNo);
	
	int insertReview(Review review);
	
	int updateReview(int recommandNo, int reviewNo);
	
	int selectReviewByRecommand(int reviewNo);
}
