package com.yedam.java.free.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class FBVO {
	private int bno;			// 게시판 번호
	private String title;		// 제목
	private String contents;	// 내용
	private String writer;		// 작성자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDate;		// 등록일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedate;	// 수정일
	private String image;		// 첨부파일
}
