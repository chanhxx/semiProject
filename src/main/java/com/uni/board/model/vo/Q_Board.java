package com.uni.board.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Q_Board {

	private int qoard_no;
	private int writer_no;
	private String category;
	private String q_board_title;
	private String q_board_content;
	private String board_secret;
	private String board_pwd;
	private int count;
	private Date create_date;
	private String status;
	
	
}
