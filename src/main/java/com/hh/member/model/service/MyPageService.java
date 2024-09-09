package com.hh.member.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hh.board.model.dao.MyBookmarkDao;
import com.hh.board.model.dao.MyReplyDao;
import com.hh.board.model.dao.MySocialDao;
import com.hh.board.model.vo.MyBookmark;
import com.hh.board.model.vo.MyReply;
import com.hh.board.model.vo.MySocial;

import db.DBTemplate;

public class MyPageService {
	
	
	
	public List<MySocial> selectMySocial(String memberNo) {
		List<MySocial> msList = null;
		SqlSession sqlSession = DBTemplate.getSqlSession();
		msList = new MySocialDao().selectMySocial(sqlSession, memberNo);
		sqlSession.close();
		return msList; 
	}
	
	public List<MyReply> selectMyReply(String memberNo) {
		List<MyReply> mrList = null;
		SqlSession sqlSession = DBTemplate.getSqlSession();
		mrList = new MyReplyDao().selectMyReply(sqlSession, memberNo);
		sqlSession.close();
		return  mrList;
		
	}

	public List<MyBookmark> selectMyBookmark(String memberNo) {
		List<MyBookmark> mbList = null;
		SqlSession sqlsession = DBTemplate.getSqlSession();
		mbList = new MyBookmarkDao().selectMyBookmark(sqlsession, memberNo);
		sqlsession.close();
		return mbList;
	}
}
