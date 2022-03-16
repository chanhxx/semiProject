package com.uni.notice.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import static com.uni.common.JDBCTemplate.*;

import com.uni.notice.model.vo.Notice;

public class NoticeDao {

	// 프로퍼티즈 선언
	private Properties prop = new Properties();
	
	// 프로퍼티즈 파일 읽어 오기
	public NoticeDao() {
		// 파일 가져와서 변수에 담기
		String fileName = NoticeDao.class.getResource("/sql/notice/notice-query.properties").getPath();
		
		try {
			// 파일 읽어 오기
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// 전체 조회하는 메소드
	public ArrayList<Notice> selectList(Connection conn) {
		
		// list 선언
		ArrayList<Notice> list = new ArrayList<Notice>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		// sql 구문 가져오기
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			// 전체 리스트 가져오기 때문에 while로
			while(rset.next()) {
				
				Notice notice = new Notice(rset.getInt("NOTICE_NO"),
										   rset.getString("NOTICE_TITLE"),
										   rset.getString("NOTICE_CONTENT"),
										   rset.getInt("COUNT"),
										   rset.getDate("CREATE_DATE"));
				
				list.add(notice); // list에 notice 객체 담기
				
			}
			
			/*
			System.out.println("list ==== dao ==== ");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			*/
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 역순으로 닫아주기
			close(rset);
			close(pstmt);
		}
		
		return list;
	}


	// 공지사항 게시글 등록하는 이벤트
	public int insertNotice(Connection conn, Notice notice) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		// insert 는 ResultSet 필요 없음
		
		String sql = prop.getProperty("insertNotice");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeContent());
			
			result = pstmt.executeUpdate(); // result 에 담아주기
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


	// 조회수 증가시키는 메소드
	public int increaseCount(Connection conn, int nno) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, nno);
			
			result = pstmt.executeUpdate();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	// 공지사항 게시글 하나 가져오는 메소드 (상세 페이지)
	public Notice selectNotice(Connection conn, int nno) {
		
		Notice notice = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectNotice");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			// 객체 하나니까 if
			if(rset.next()) {
				
				notice = new Notice(rset.getInt("NOTICE_NO"),
									rset.getString("NOTICE_TITLE"),
									rset.getString("NOTICE_CONTENT"),
									rset.getInt("COUNT"),
									rset.getDate("CREATE_DATE"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return notice;
	}


	

}
