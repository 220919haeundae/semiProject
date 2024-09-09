package com.hh.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hh.board.model.vo.MyBookmark;

public class MyBookmarkDao {

	public List<MyBookmark> selectMyBookmark(SqlSession sqlsession, String memberNo) {
		
		return sqlsession.selectList("boardMapper.MyBookmark", memberNo);
	}
	
}
