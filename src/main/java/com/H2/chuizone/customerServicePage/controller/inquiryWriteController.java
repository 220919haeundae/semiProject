package com.h2.chuizone.customerServicePage.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.h2.chuizone.customerServicePage.model.service.CustomerService;
import com.h2.chuizone.customerServicePage.model.vo.Board;

/**
 * Servlet implementation class inquiryWriteController
 */

@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 50, maxRequestSize = 1024 * 1024 * 50 * 5)
@WebServlet("/inquiry.do")
public class InquiryWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InquiryWriteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userNo = request.getParameter("userNo");
		String boardType = request.getParameter("boardType");
		String inquiryTitle = request.getParameter("inquiryTitle");
		String inquiryContent = request.getParameter("inquiryContent");
		Collection<Part> parts = request.getParts();
		String path = request.getServletContext().getRealPath("/resources/uploadFiles/");
		StringBuilder originFileNames = new StringBuilder();
		StringBuilder changeFileNames = new StringBuilder();
		int i = 0;
		int result;

		
		for (Part part : parts) {
			// 사용자로부터 요청을 모두 Part타입으로 받기 때문에(첨부파일인지 아닌지 상관없이)
			// 객체에서 name을 추출해서 upfile(첨부파일 input의 name)이 아닐 경우 continue;
			if (!part.getName().equals("upfile"))
				continue;
			// 2차로 upfile의 value일 때 제출된 파일명을 확인하여 ""(첨부파일이 없을 시 빈 문자열로 옴)
			// 가 아닐 경우 첨부파일 처리절차 실행
			if(!part.getSubmittedFileName().isEmpty()) {
				
				int num;
				byte[] buf = new byte[1024];
				String originFileName = part.getSubmittedFileName();

				// 파읾령 변환
				// 1) 파일 업로드 시간(년월일시분초)
				String currentTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				// 2) 5자리 랜덤값 : Math.random()
				int randNum = (int) (Math.random() * 90000 + 10000);

				// 3) 원본 파일의 확장자
				// 문자열 .substring(마지막 .의 취지)
				String ext = originFileName.substring(originFileName.lastIndexOf("."));
				// 업로드 시간(밀리초 단위) + 랜덤값(5자리) + 확장자
				String changeFileName = currentTime + randNum + ext;

				try (BufferedInputStream bis = new BufferedInputStream(part.getInputStream());
						BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + changeFileName))) {
					while ((num = bis.read(buf)) != -1) {
						bos.write(buf, 0, num);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				if(!originFileName.isEmpty() && !changeFileName.isEmpty() ) {
					originFileNames.append(originFileName);
					originFileNames.append(",");
					changeFileNames.append(path + changeFileName); // 저장된 물리경로 + 변환된 첨부파일명
					changeFileNames.append(",");
				}
				
			}
			
			
		}
		
		if(originFileNames.length()>0 && changeFileNames.length()>0) {
			originFileNames.delete(originFileNames.length() - 1, originFileNames.length());
			changeFileNames.delete(changeFileNames.length() - 1, changeFileNames.length());
		}
		
		Board b = new Board();
		b.setBoardTitle(inquiryTitle);
		b.setBoardContent(inquiryContent);
		b.setUserNo(userNo);
		b.setBoardType(boardType);
		b.setOriginFileNames(originFileNames.toString());
		b.setChangeFileNames(changeFileNames.toString());
		
		result = new CustomerService().insertInquiryBoard(b);
		
		if(result > 0) {
			request.getSession().setAttribute("alertMsg", "요청이 성공적으로 전달되었습니다.");
			request.getRequestDispatcher("views/csPage/personalInquiryPage.jsp").forward(request, response);
		} else {
			request.getSession().setAttribute("alertMsg", "1:1문의 게시에 실패했습니다. 다시 시도해주세요.");
			request.getRequestDispatcher("views/csPage/personalInquiryPage.jsp").forward(request, response);
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
