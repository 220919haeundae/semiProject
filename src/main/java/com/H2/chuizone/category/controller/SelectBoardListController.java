package com.h2.chuizone.category.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.h2.chuizone.category.model.dto.SelectCategoryBoardListDto;
import com.h2.chuizone.category.model.service.CategoryBoardService;
import com.h2.chuizone.category.model.service.CategoryBoardServiceImpl;
import com.h2.chuizone.common.Pageing;
import com.h2.chuizone.common.board.model.service.BoardService;
import com.h2.chuizone.common.board.model.service.BoardServiceImpl;

/**
 * Servlet implementation class selectBoardListController
 */
@WebServlet("/selectBoardList.me")
public class SelectBoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBoardListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		CategoryBoardService categoryBoardService = new CategoryBoardServiceImpl();
		BoardService boardService = new BoardServiceImpl();
		
		int curPage = 0;
		
		if(request.getAttribute("page") != null) {
			curPage = (int)request.getAttribute("page");
		} else {
			curPage  = 1;
		}
		
		int maxBoardNum = categoryBoardService.selectMaxPageNumber();
		List<SelectCategoryBoardListDto> boardList = boardService.selectCategoryBoardList((curPage - 1) * 10 + 1, curPage * 10);
		System.out.println(boardList);
		if(request.getAttribute("page") != null) {
			request.setAttribute("pageing", 
									new Pageing(maxBoardNum,  curPage));
			request.setAttribute("board", 
					boardList);
		} else {
			request.setAttribute("pageing", 
					new Pageing(maxBoardNum, curPage));
			request.setAttribute("board", 
					boardList);
		}
		
		request.getRequestDispatcher("views/category/category.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
