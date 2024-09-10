package com.H2.chuizone.mypage.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.vo.MyBookmark;



public class MyBookmarkDao {

	public List<MyBookmark> selectMyBookmark(SqlSession sqlsession, String memberNo) {
		
		return sqlsession.selectList("boardMapper.MyBookmark", memberNo);
	}
	
}
