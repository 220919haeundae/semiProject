package com.H2.chuizone.mypage.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.dao.MyBookmarkDao;
import com.H2.chuizone.mypage.model.dao.MyReplyDao;
import com.H2.chuizone.mypage.model.dao.MySocialDao;
import com.H2.chuizone.mypage.model.vo.MyBookmark;
import com.H2.chuizone.mypage.model.vo.MyReply;
import com.H2.chuizone.mypage.model.vo.MySocial;
import com.H2.chuizone.template.MybatisTemplate;


public class MyPageService {
	
	
	
	public List<MySocial> selectMySocial(String memberNo) {
		List<MySocial> msList = null;
		SqlSession sqlSession = MybatisTemplate.getSqlSession();
		msList = new MySocialDao().selectMySocial(sqlSession, memberNo);
		sqlSession.close();
		return msList; 
	}
	
	public List<MyReply> selectMyReply(String memberNo) {
		List<MyReply> mrList = null;
		SqlSession sqlSession = MybatisTemplate.getSqlSession();
		mrList = new MyReplyDao().selectMyReply(sqlSession, memberNo);
		sqlSession.close();
		return  mrList;
		
	}

	public List<MyBookmark> selectMyBookmark(String memberNo) {
		List<MyBookmark> mbList = null;
		SqlSession sqlsession = MybatisTemplate.getSqlSession();
		mbList = new MyBookmarkDao().selectMyBookmark(sqlsession, memberNo);
		sqlsession.close();
		return mbList;
	}
}
