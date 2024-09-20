package com.h2.chuizone.common.memberreviewrecommand.model.service;

import com.h2.chuizone.common.memberreviewrecommand.model.vo.MemberReviewRecommand;

public interface MemberReviewRecommandService {
	int selectMemberReviewRecommand(int reviewNo, int memberNo);
	
	int insertMemberReviewRecommand(MemberReviewRecommand memberReviewRecommand);
	
	int deleteMemberReviewRecommand(int reviewNo, int memberNo);
}
