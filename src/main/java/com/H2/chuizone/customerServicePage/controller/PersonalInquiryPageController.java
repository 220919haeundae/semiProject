package com.h2.chuizone.customerServicePage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h2.chuizone.customerServicePage.model.service.CustomerService;
import com.h2.chuizone.customerServicePage.model.vo.Board;
import com.h2.chuizone.member.model.vo.Member;
import com.h2.chuizone.template.PageInfo;
import com.h2.chuizone.template.Pagination;

/**
 * Servlet implementation class PiPageController
 */
@WebServlet("/toPiPage.do")
public class PersonalInquiryPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalInquiryPageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNo = ((Member)request.getSession().getAttribute("loginUser")).getUserNo() + "";
		int cpage = 1;
		if(request.getParameter("cpage") != null) {
			cpage = Integer.parseInt(request.getParameter("cpage"));
		}
		System.out.println(cpage);
		int inquiryListCount = new CustomerService().inquiryListCount(userNo);
		System.out.println(inquiryListCount);
		PageInfo pi = Pagination.getPageInfo(inquiryListCount, cpage, 5, 6);
		ArrayList<Board> inquiryList = new CustomerService().selectInquiryList(pi, userNo);
		
		
		if(inquiryList != null) {
			request.setAttribute("inquiryList", inquiryList);
			System.out.println(inquiryList.size());
			request.setAttribute("pi", pi);
			request.getRequestDispatcher("views/csPage/personalInquiryPage.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("views/csPage/personalInquiryPage.jsp").forward(request, response);
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
