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
		String userNo = request.getParameter("userNo");
		System.out.println(userNo);
		ArrayList<Board> inquiryList = new CustomerService().selectInquiryList(userNo);
		
		
		if(inquiryList != null) {
			request.setAttribute("inquiryList", inquiryList);
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
