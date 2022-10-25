package com.yedam.dsr.book.service;

import java.util.List;

public interface BookService {
	public List<BookVO> selectBookList();
	
	public BookVO selectBookNo();
	
	public int insertBookInfo(BookVO vo);
	
	public int updateBookInfo(BookVO vo);
	
	public int deleteBookInfo(int bookNo);
}
