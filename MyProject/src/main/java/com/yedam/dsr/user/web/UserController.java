package com.yedam.dsr.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.dsr.user.service.UserService;
import com.yedam.dsr.user.service.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	// 전체조회
	@GetMapping("userList")
	public String getUserList(Model model) {
		model.addAttribute("users", service.selectUserList());
		return "user/list";
	}
	
	// 단건조회
	@RequestMapping("/userInfo/{id}")
	public String getUserInfo(@PathVariable String id, Model model) {
		model.addAttribute("user", service.selectUser(id));
		return "user/userInfo";
	}
	
	// 관리자 로그인 폼
	@GetMapping("loginForm")
	public String loginAdmin() {
		return "user/loginForm";
	}
	
	// 관리자 로그인
	@PostMapping("login")
	public String login(UserVO vo, RedirectAttributes ratt) {
		String result = service.loginAdmin(vo).getUserType();
		if(result.equals("0")) {
			ratt.addFlashAttribute("msg","관리자로 로그인 되었습니다.");
			
		} else if(result.equals("1")) {
			ratt.addFlashAttribute("msg","관리자가 아닙니다.");
		}
		
		return "redirect:userList";
	}
	
	@GetMapping("insertForm")
	public String insertForm() {
		return "user/inserForm";
	}
}
