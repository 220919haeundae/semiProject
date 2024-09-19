package com.H2.chuizone.mypage.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.customerServicePage.model.vo.Board;
import com.H2.chuizone.member.model.dao.MemberDao;
import com.H2.chuizone.member.model.vo.Member;
import com.H2.chuizone.mypage.model.dao.MyBookmarkDao;
import com.H2.chuizone.mypage.model.dao.MyReplyDao;
import com.H2.chuizone.mypage.model.dao.MySocialDao;
import com.H2.chuizone.mypage.model.vo.MyBookmark;
import com.H2.chuizone.mypage.model.vo.MyReply;
import com.H2.chuizone.mypage.model.vo.MySocial;
import com.H2.chuizone.template.MybatisTemplate;
import com.H2.chuizone.template.PageInfo;


public class MyPageService {
	SqlSession sqlSession;
	
	public MyPageService() {
		this.sqlSession = MybatisTemplate.getSqlSession();
	}
	
	

	public int selectMySocialCount(String userNo) {
		int result = 0;
		result = new MySocialDao().selectMySocialCount(sqlSession, userNo);
		return result;
	}

	public ArrayList<MySocial> selectMySocialList(PageInfo pi, String userNo) {
		ArrayList<MySocial> mySocialList = null;
		mySocialList = new MySocialDao().selectMySocial(sqlSession, pi, userNo);
		return mySocialList;
	}
	
	

	public int selectMyReplyCount(String userNo) {
		int result = 0;
		result = new MyReplyDao().selectMyReplyCount(sqlSession, userNo);
		return result;
	}

	public ArrayList<MyReply> selectMyReply(PageInfo pi, String userNo) {
		ArrayList<MyReply> mrList = null;
		mrList = new MyReplyDao().selectMyReply(sqlSession, pi, userNo);
		return  mrList;
		
	}



	public int selectMyBookmarkCount(String userNo) {
		int result = 0;
		result = new MyBookmarkDao().selectMyBookmarkCount(sqlSession, userNo);
		return result;
	}
	
	public ArrayList<MyBookmark> selectMyBookmark(PageInfo pi, String memberNo) {
		ArrayList<MyBookmark> mbList = null;
		mbList = new MyBookmarkDao().selectMyBookmark(sqlSession, pi, memberNo);
		return mbList;
	}

	
}
