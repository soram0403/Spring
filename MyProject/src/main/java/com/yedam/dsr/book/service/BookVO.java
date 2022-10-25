package com.yedam.dsr.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	private int bookNo;
	private String bookName;
	private String bookCovering;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd") // setter쓸때 format
	private Date bookDate;
	
	private int bookPrice;
	private String bookPublisher;
	private String bookInfo;
}
