package com.uni.notice.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import static com.uni.common.JDBCTemplate.*;

import com.uni.notice.model.dao.NoticeDao;
import com.uni.notice.model.vo.Notice;

public class NoticeService {

	// 전체 조회하는 메소드
	public ArrayList<Notice> selectList() {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 그대로 가져오기만 할 거라 커넥션만 넘겨 받은 결과 list에 담기
		ArrayList<Notice> list = new NoticeDao().selectList(conn);
		
		close(conn); // 커넥션 닫기
		
		return list; // list 리턴
	}

	// 게시글 등록하는 메소드
	public int insertNotice(Notice notice) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		int result = new NoticeDao().insertNotice(conn, notice);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	// 게시글 하나 가져오는 메소드
	public Notice selectNotice(int nno) {
		
		Connection conn = getConnection(); // 커넥션 연결
		
		// 조회수 증가시키는 메소드로
		int result = new NoticeDao().increaseCount(conn, nno);
		
		// 해당 게시글 받을 객체
		Notice notice = null;
		
		if(result > 0) {
			commit(conn);
			// 객체 가져와서 담기
			notice = new NoticeDao().selectNotice(conn, nno);
			
		} else {
			rollback(conn);
		}
		
		close(conn);
		
		return notice;
	}

}
