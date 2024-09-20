package com.h2.chuizone.common.memberclub.model.service;

import java.util.List;

import com.h2.chuizone.common.memberclub.model.vo.MemberClub;

public interface MemberClubService {
	List<Integer> selectJoinClub(int memberId);
	
	int insertJoinClub(MemberClub memberClub);
	
	int deleteJoinClub(MemberClub memberClub);
}
