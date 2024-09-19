package com.H2.chuizone.mypage.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.H2.chuizone.mypage.model.vo.MySocial;
import com.H2.chuizone.template.PageInfo;

public class MySocialDao {

	public ArrayList<MySocial> selectMySocial(SqlSession sqlSession, PageInfo pi, String userNo) {
		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		ArrayList<MySocial> resultList = (ArrayList)sqlSession.selectList("boardMapper.selectMySocial", userNo, rowBounds);
		
		return resultList;

	}

	public int selectMySocialCount(SqlSession sqlSession, String userNo) {
		return sqlSession.selectOne("boardMapper.selectMySocialCount", userNo);
	}

}
