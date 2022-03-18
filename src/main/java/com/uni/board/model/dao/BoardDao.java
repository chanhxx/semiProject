package com.uni.board.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.uni.common.JDBCTemplate.*;
import java.util.ArrayList;
import java.util.Properties;

import com.uni.board.model.vo.Attachment;
import com.uni.board.model.vo.Board;
import com.uni.board.model.vo.PageInfo;

public class BoardDao {
	
	// 프로퍼티즈 선언
	private Properties prop = new Properties();
	
	// 프로퍼티즈 파일 읽어 오기
	public BoardDao() {
		// 파일 가져와서 변수에 담기
		String fileName = BoardDao.class.getResource("/sql/board/board-query.properties").getPath();
		
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
	
	
	// 총 게시글 개수 카운트하는 메소드
	public int getListCount(Connection conn) {
		
		int listCount = 0;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		// sql 구문 가져오기
		String sql = prop.getProperty("getListCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			// 조회 결과 총 개수 하나이기 때문에 if
			if(rset.next()) {
				listCount = rset.getInt(1); // 결과 listCount에 담기
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 역순으로 닫아주기
			close(rset);
			close(pstmt);
		}

		return listCount;
	}
	
	// 전체 조회하는 메소드
	public ArrayList<Board> selectList(Connection conn, PageInfo pi) {
		
		// list 선언
		ArrayList<Board> list = new ArrayList<Board>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		// sql 구문 가져오기
		String sql = prop.getProperty("selectList");
		
		// 페이징 시작, 끝 페이지 로 해야 전체 조회 가능
		int startRow = (pi.getCurrentPage()-1) * pi.getBoardLimit() + 1;
		int endRow = startRow + pi.getBoardLimit() - 1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			// 전체 리스트 가져오기 때문에 while로
			while(rset.next()) {
				
				Board board = new Board(); // Board 객체 생성
		  	 	// set으로 설정
		  	 	board.setBoardNo(rset.getInt("BOARD_NO"));
				board.setBoardWriter(rset.getString("USER_ID"));
				board.setCategory(rset.getString("CATEGORY"));
				board.setBoardTitle(rset.getString("BOARD_TITLE"));
				board.setBoardContent(rset.getString("BOARD_CONTENT"));
				board.setCount(rset.getInt("COUNT"));
				board.setCreateDate(rset.getDate("CREATE_DATE"));
				
				list.add(board); // list에 notice 객체 담기
			}
			
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
	
	
	// 공지사항 게시글 등록하는 메소드
	public int insertBoard(Connection conn, Board b) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		// insert 는 ResultSet 필요 없음
		
		String sql = prop.getProperty("insertBoard");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(b.getBoardWriter()));
			pstmt.setString(2, b.getCategory());
			pstmt.setString(3, b.getBoardTitle());
			pstmt.setString(4, b.getBoardContent());
			pstmt.setString(5, b.getBoardPwd());
			
			result = pstmt.executeUpdate(); // result 에 담아주기
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	// 첨부파일 등록하는 메소드
	public int insertAttachment(Connection conn, Attachment at) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertAttachment");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, at.getOriginName());
			pstmt.setString(2, at.getChangeName());
			pstmt.setString(3, at.getFilePath());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	// 조회수 증가시키는 메소드
	public int increaseCount(Connection conn, int bno) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bno);
			
			result = pstmt.executeUpdate();
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


	public Board selectBoard(Connection conn, int bno) {
		
		
		
		
		return null;
	}


	


	

}
