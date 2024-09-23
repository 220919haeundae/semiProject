package com.h2.chuizone.category.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h2.chuizone.calender.model.dto.CalenderDto;
import com.h2.chuizone.calender.model.service.CalenderService;
import com.h2.chuizone.calender.model.service.CalenderServiceImpl;

/**
 * Servlet implementation class goToCalenderController
 */
@WebServlet("/calender.me")
public class GoToCalenderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoToCalenderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int categoryBoardNo = Integer.parseInt(request.getParameter("categoryBoardNo"));
		String clubName = request.getParameter("clubName");
		CalenderService calenderService = new CalenderServiceImpl();
		
		List<CalenderDto> calenderDtoList = calenderService.selectCalenderBoardList(categoryBoardNo);
		
		request.setAttribute("categoryBoardNo", categoryBoardNo);
		request.setAttribute("clubName", clubName);
		request.setAttribute("calender", calenderDtoList);
		
		request.getRequestDispatcher("views/calender/calender.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
