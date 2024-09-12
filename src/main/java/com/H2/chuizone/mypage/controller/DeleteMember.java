package com.H2.chuizone.mypage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.H2.chuizone.member.model.service.MemberService;
import com.H2.chuizone.member.model.vo.Member;

/**
 * Servlet implementation class DeleteMember
 */
@WebServlet("/delete.do")
public class DeleteMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		Member m = new Member();
		m.setUserId(userId);
		m.setUserPw(userPwd);
		
		System.out.println(m.getUserId() + m.getUserPw());
		
		int result = new MemberService().deleteMember(m);
		
		System.out.println(result);
		if(result > 0) {
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("alertMsg", "회원탈퇴 성공했습니다.");
			response.sendRedirect("/hobbyharvest/views/main.jsp");	
		} else {
			request.getSession().setAttribute("alertMsg", "회원탈퇴 실패했습니다.");
			response.sendRedirect( "/views/myPage/myInfo.jsp");
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
