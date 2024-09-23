package com.h2.chuizone.calender.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h2.chuizone.common.board.model.service.BoardService;
import com.h2.chuizone.common.board.model.service.BoardServiceImpl;

/**
 * Servlet implementation class DeleteCalenderBoardController
 */
@WebServlet("/deleteCalenderBoard.me")
public class DeleteCalenderBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCalenderBoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		int categoryBoardNo = Integer.parseInt(request.getParameter("categoryBoardNo"));
		String clubName = request.getParameter("clubName");
		
		BoardService boardService = new BoardServiceImpl();
		boardService.deleteCategoryBoard(boardNo);
		
		request.setAttribute("categoryBoardNo", categoryBoardNo);
		request.setAttribute("clubName", clubName);
		
		request.getRequestDispatcher("calender.me").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
