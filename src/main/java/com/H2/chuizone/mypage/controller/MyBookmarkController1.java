package com.H2.chuizone.mypage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.H2.chuizone.mypage.model.vo.MyBookmark;
import com.H2.chuizone.mypage.service.MyPageService;
import com.google.gson.Gson;


/**
 * Servlet implementation class MyBookmarkController1
 */
@WebServlet("/myBookmark.do")
public class MyBookmarkController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyBookmarkController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberNo = request.getParameter("data");
		List<MyBookmark> mbList = new MyPageService().selectMyBookmark("memberNo");
		
		if(mbList != null) {
			Gson gson = new Gson();
			response.setContentType("application/json; charset=utf-8");
			gson.toJson(mbList, response.getWriter());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
