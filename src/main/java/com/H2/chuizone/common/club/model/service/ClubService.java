package com.h2.chuizone.common.club.model.service;

import java.util.List;

import com.h2.chuizone.common.club.model.vo.Club;

public interface ClubService {
	int insertClub(Club club);
	
	List<Club> selectClub();
	
	String selectClubName(int clubId);
	
	int updateClub(int clubNo, String clubName);
}
