package com.H2.chuizone.mypage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.H2.chuizone.mypage.model.vo.MyReply;
import com.H2.chuizone.mypage.service.MyPageService;
import com.google.gson.Gson;


/**
 * Servlet implementation class MyCommentController1
 */
@WebServlet("/myComment.do")
public class MyCommentController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCommentController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String memberNo = request.getParameter("data");
		List<MyReply> mrList = new MyPageService().selectMyReply(memberNo);
		
			Gson gson = new Gson();
			response.setContentType("application/json; charset=utf-8");
			gson.toJson(mrList, response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
