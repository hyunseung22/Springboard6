package com.itwillbs.domain;

import java.security.Timestamp;

import lombok.Data;

/*
 * tbl_member 테이블의 정보를 저장하는 객체
 */
@Data
public class BoardVO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String viewcnt;
	private Timestamp regdate;
	
}
