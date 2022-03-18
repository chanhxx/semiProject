package com.uni.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.uni.board.model.service.BoardService;
import com.uni.board.model.vo.Board;
import com.uni.notice.model.service.NoticeService;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/boardList.do")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 공지사항 전체를 조회하기 위해 ArrayList 사용
		// 조회해서 가져 온 결과 list에 담기
		ArrayList<Board> list = new BoardService().selectList();
		
		// list jsp로 보내기
		request.setAttribute("list", list);
		
		// list 찍어보기
		for(Board n : list) {
			System.out.println("list : " + n);
		}
		
		// json 으로 변환 설정
		response.setContentType("application/json; charset=utf-8");
		// getWriter() 메소드를 사용해야 데이터를 전달
		new Gson().toJson(list, response.getWriter());
		
		// 화면 전환 > 게시판 목록으로
		//request.getRequestDispatcher("views/board/boardListView.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
