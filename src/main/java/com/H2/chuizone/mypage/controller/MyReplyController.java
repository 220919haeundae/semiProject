package com.H2.chuizone.mypage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.H2.chuizone.member.model.vo.Member;
import com.H2.chuizone.mypage.model.vo.MyReply;
import com.H2.chuizone.mypage.service.MyPageService;
import com.H2.chuizone.template.PageInfo;
import com.H2.chuizone.template.Pagination;

/**
 * Servlet implementation class MyCommentController
 */
@WebServlet("/toMyReply.do")
public class MyReplyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyReplyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int cpage = 1;
		if(request.getParameter("cpage") != null) {
			cpage = Integer.parseInt(request.getParameter("cpage"));
		}
		String userNo = ((Member)session.getAttribute("loginUser")).getUserNo() + "";
		int myReplyCount = new MyPageService().selectMyReplyCount(userNo);
		PageInfo pi;
		
		pi = Pagination.getPageInfo(myReplyCount, cpage, 5, 16);
		
		ArrayList<MyReply> myReplyList = new MyPageService().selectMyReply(pi, userNo);
		
		request.setAttribute("myReplyList", myReplyList);
		request.setAttribute("pi", pi);
		
		request.getRequestDispatcher("views/myPage/myReply.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
