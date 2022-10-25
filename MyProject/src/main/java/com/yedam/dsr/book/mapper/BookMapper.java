package com.yedam.dsr.book.mapper;

import java.util.List;

import com.yedam.dsr.book.service.BookVO;

public interface BookMapper {
	public List<BookVO> getBookList();
	
	public BookVO getBookNo();
	
	public int insertBook(BookVO vo);
	
	public int updateBook(BookVO vo);
	
	public int deleteBook(int bookNo);
}
