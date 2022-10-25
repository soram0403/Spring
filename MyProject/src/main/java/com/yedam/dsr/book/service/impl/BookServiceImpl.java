package com.yedam.dsr.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.dsr.book.mapper.BookMapper;
import com.yedam.dsr.book.service.BookService;
import com.yedam.dsr.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper mapper;
	
	@Override
	public List<BookVO> selectBookList() {
		return mapper.getBookList();
	}

	@Override
	public BookVO selectBookNo() {
		
		return mapper.getBookNo();
	}

	@Override
	public int insertBookInfo(BookVO vo) {
		return mapper.insertBook(vo);
	}

//	@Override
//	public int updateBookInfo(BookVO vo) {
//		BookVO findBook = mapper.getBookNo();
//		vo.setBookNo(findBook.getBookNo());
//		return mapper.updateBook(vo); // mapper 중첩 가능
//	}

	
	@Override
	public int updateBookInfo(BookVO vo) {
		return mapper.updateBook(vo);
	}
	
	@Override
	public int deleteBookInfo(int bookNo) {
		return mapper.deleteBook(bookNo);
	}



}
