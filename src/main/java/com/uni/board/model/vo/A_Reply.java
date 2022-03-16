package com.uni.board.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class A_Reply {
	
	private int replyNo;
	private int refBoardNo;
	private String replyContent;
	private Date createDate;
	private String status;

}
