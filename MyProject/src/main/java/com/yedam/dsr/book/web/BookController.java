package com.yedam.dsr.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.dsr.book.service.BookService;
import com.yedam.dsr.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("booklist")
	public String selectBookList(Model model) {
		model.addAttribute("list",service.selectBookList());
		return "book/list";
	}
	
	// 도서등록 페이지 이동 + 현재 등록될, 예상되는 번호
	@GetMapping("bookinsert")
	public String insertBookForm(Model model) {
		model.addAttribute("info", service.selectBookNo());
		return "book/insert";
	}
	
	// 도서정보를 DB에 등록
	@PostMapping("bookinsert")
	public String insertBookInfo(BookVO bookVO) {
		service.insertBookInfo(bookVO);
		return "redirect:booklist";
	}
}
