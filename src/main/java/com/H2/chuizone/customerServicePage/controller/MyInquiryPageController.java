package com.h2.chuizone.customerServicePage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h2.chuizone.customerServicePage.model.service.CustomerService;
import com.h2.chuizone.customerServicePage.model.vo.Board;
import com.h2.chuizone.member.model.vo.Member;

/**
 * Servlet implementation class MyInquiryPageController
 */
@WebServlet("/toMyInquiry.do")
public class MyInquiryPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInquiryPageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNo = ((Member)request.getSession().getAttribute("loginUser")).getUserNo()+"";
		String boardNo = request.getParameter("boardNo");
		System.out.println(userNo);
		System.out.println(boardNo);
		
		Board myInquiry = new CustomerService().selectInquiry(userNo, boardNo);
		
		System.out.println(myInquiry);
		if(myInquiry.getChangeFileNames() != null) {
			String[] originFileNames = myInquiry.getOriginFileNames().split(",");
			String[] changeFileNames = myInquiry.getChangeFileNames().split(",");
			
			request.setAttribute("orgFileNames", originFileNames);
			request.setAttribute("chgFileNames", changeFileNames);
			
		}
		
		
		if( myInquiry != null) {
			request.setAttribute("myInquiry", myInquiry);
			request.getRequestDispatcher("views/csPage/myInquiryPage.jsp").forward(request, response);
		} else {
			request.setAttribute("alertMsg", "문의사항 조회에 실패했습니다.");
			request.getRequestDispatcher("toPiPage.do").forward(request, response);
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
