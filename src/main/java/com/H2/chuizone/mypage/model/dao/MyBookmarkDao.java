package com.H2.chuizone.mypage.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.vo.MyBookmark;
import com.H2.chuizone.template.PageInfo;

public class MyBookmarkDao {

	public int selectMyBookmarkCount(SqlSession sqlSession, String userNo) {

		return sqlSession.selectOne("boardMapper.selectMyBookmarkCount", userNo);
	}

	public ArrayList<MyBookmark> selectMyBookmark(SqlSession sqlsession, PageInfo pi, String memberNo) {

		int offset = (pi.getCurrentPage()-1) * pi.getBoardLimit();
		
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return (ArrayList)sqlsession.selectList("boardMapper.MyBookmark", memberNo, rowBounds);
	}

}
