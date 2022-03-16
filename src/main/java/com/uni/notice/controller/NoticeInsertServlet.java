package com.uni.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uni.notice.model.service.NoticeService;
import com.uni.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeInsertServlet
 */
@WebServlet("/noticeInsert.do")
public class NoticeInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// jsp에서 title, content 가져와서 담기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// Notice 객체에 담기
		Notice notice = new Notice(title, content.replaceAll("\n", "<br>"));
		
		// 만든 객체 넘겨서 result 로 받기
		int result = new NoticeService().insertNotice(notice);
		
		// 잘 담겨 왔다면
		if(result > 0) {
			
			
			// 해당 공지사항 게시글 상세 페이지로 이동
			response.sendRedirect("noticeDetail.do");
		
		// 실패 시
		} else {
			
			
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
