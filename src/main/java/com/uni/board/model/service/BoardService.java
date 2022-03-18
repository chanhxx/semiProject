package com.uni.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import static com.uni.common.JDBCTemplate.*;

import com.uni.board.model.dao.BoardDao;
import com.uni.board.model.vo.Attachment;
import com.uni.board.model.vo.Board;
import com.uni.board.model.vo.PageInfo;

public class BoardService {
	
	// 총 게시글 개수 카운트하는 메소드
	public int getListCount() {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 총 게시글 개수 반환하기 위해
		int listCount = new BoardDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	// 전체 조회하는 메소드
	public ArrayList<Board> selectList(PageInfo pi) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		ArrayList<Board> list = new BoardDao().selectList(conn, pi);
		
		close(conn);
		
		return list;
	}
	
	// 게시글 등록하는 메소드
	public int insertBoard(Board b, Attachment at) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 게시글 등록할 Board 객체 넘겨 받은 결과 담기
		int result1 = new BoardDao().insertBoard(conn, b);
		
		// 첨부파일
		int result2 = 1; // 0 이면 결과 무조건 0이기 떼문에 1 이상이면 됨
		
		// 첨부파일 등록한 경우
		if(at != null) {
			// 첨부파일 넘겨 받은 결과 담기
			result2 = new BoardDao().insertAttachment(conn, at);
		}
		
		if(result1 * result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result1 * result2;
	}

	// 게시글 하나 가져오는 메소드
	public Board selectBoard(int bno) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 조회수 증가시키는 메소드로
		int result = new BoardDao().increaseCount(conn, bno);
		
		// 해당 게시글 받을 객체
		Board board = null;
		
		if(result > 0) {
			commit(conn);
			// 객체 가져와서 담기
			board = new BoardDao().selectBoard(conn, bno);
			
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return board;
	}

	// 게시글 업데이트 하는 메소드
	public int updateBoard(Board b) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 넘겨 받은 결과 result에 담아서
		int result = new BoardDao().updateBoard(conn, b);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	// 게시글 삭제하는 메소드 (상태값 n으로)
	public int deleteBoard(int bno) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 넘겨 받은 결과 result에 담아서
		int result = new BoardDao().deleteBoard(conn, bno);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	

}
