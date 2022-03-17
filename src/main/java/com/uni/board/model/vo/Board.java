package com.uni.board.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {

	private int boardNo;
	private int writerNo;
	private String category;
	private String boardTitle;
	private String boardContent;
	private String boardSecret;
	private String boardPwd;
	private int count;
	private Date createDate;
	private String status;
	
	
}
