package com.yedam.java.free.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.free.service.FBService;
import com.yedam.java.free.service.FBVO;

@Controller
@RequestMapping("freeBoard")
public class FreeBoardController {
	@Autowired
	FBService fbService;
	
	// 등록 - 폼
	// 보내는 값이 없을 경우 GetMapping
	// 데이터를 보낼 경우 Model
	@GetMapping("insert")
	public String insertForm(Model model) {
		model.addAttribute("no", fbService.getBoardNo());
		// model에 담겨서 view에 보냄
		return "freeBoard/insertForm";
	}
	
	// 등록 - DB insert
	// 같은경로라도 통신하는 방법이 다르면 같은 이름 사용 가능
	@PostMapping("insert")
	public String insertFreeBoard(FBVO fbVO, RedirectAttributes ratt) {
		Map<String, Object> result = fbService.insertBoardInfo(fbVO);
		ratt.addFlashAttribute("msg", result.get("result") + "건이 등록되었습니다.");
		// redirect:list  상대경로
		return "redirect:list";
		
	}
	
	// 전체조회
	@GetMapping("list")
	public String selectFreeBoard(Model model) {
								  // 무조건 값이 필요하므로 안쓸경우 (required = false)
								  // @RequestParam(required =false) String msg) {
		//System.out.println("Message : " + msg);
		model.addAttribute("boardList", fbService.selectBoardList());
		return "freeBoard/boardList";
	}
	
	// 단건조회
	@GetMapping("info")			// 다양한 객체 : 커맨드 객체, 값을 받아옴 : Model
	public String selectBoardInfo(FBVO fbVO, Model model) {
		model.addAttribute("board", fbService.selectBoardInfo(fbVO));
		
		return "freeBoard/boardInfo";
	}
	
	// 수정 - 폼
	
	// 수정 - DB update
	
	// 삭제
	
}
