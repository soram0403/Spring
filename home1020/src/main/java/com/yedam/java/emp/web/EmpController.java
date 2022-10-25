package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller // bean에 등록
public class EmpController {
	
	@Autowired // 서비스 연결시 interface Autowired
	EmpService empService;
			   // EmpServiceImpl 필드명
	
	@RequestMapping("/allList")
	public String getEmpList(Model model) {
		model.addAttribute("empInfoList",empService.selectAllEmp());
		return "emp/empList";
	}
	
	@GetMapping("/info")
	public String getEmpInfo(EmpVO empVO, Model model) {
		EmpVO findEmp = empService.selectOneEmp(empVO);
		model.addAttribute("empInfo", findEmp);
		return "emp/empInfo";
	}
	
	// 페이지 전환
	@GetMapping("/insertForm")
	public String printInsertForm() {
		return "emp/insertForm";
	}
	
	// 데이터를 받아서 insert후 페이지 전환(redirect를 통해서 호출)
	// 다시 요청할때 RedirectAttributes 사용
	// addAttribute : requestParam으로 값 꺼내올수 있음
	// addFlashAttribute : re~~ 값 꺼내올 수 없음
	@PostMapping("insert")
	public String empInsert(EmpVO empVO, RedirectAttributes ratt) {
		int result = empService.insertEmpInfo(empVO);
		if(result == 1) {
			ratt.addFlashAttribute("msg","정상적으로 등록되었습니다.");
		}else {
			ratt.addAttribute("msg", "정상적으로 등록되지 않았습니다.");
		}
		return "redirect:allList";
	}
	
	// 연봉 인상
	@PostMapping("updateSal")
	public String empUpdateSal(@RequestParam int employeeId, RedirectAttributes ratt) {
		int result = empService.updateEmpSal(employeeId);
		if(result == 1) {
			ratt.addFlashAttribute("msg","정상적으로 인상되었습니다.");
		}else {
			ratt.addAttribute("msg", "정상적으로 처리되지 않았습니다.");
		}
		return "redirect:allList";
	}
	
	// 정보 수정 폼
	@GetMapping("updateEmpForm")
	public String updateEmpForm() {
		return "emp/updateForm";
	}
	
	// 정보 수정
	@PostMapping("updateEmpInfo")
	public String updateEmpInfo(EmpVO empVO, RedirectAttributes ratt) {
		int result = empService.updateEmpInfo(empVO);
		if(result == 1) {
			ratt.addFlashAttribute("msg","정상적으로 수정되었습니다.");
		}else {
			ratt.addAttribute("msg", "정상적으로 수정되지 않았습니다.");
		}
		return "redirect:allList";
	}
	
	
	// 삭제 
	@GetMapping("delete/{empId}")
	@ResponseBody
	public String empDelete(@PathVariable int empId) {
		int result = empService.deleteEmpInfo(empId);
		String message = null;
		if(result == 1) {
			message = "사원번호 : " + empId + "정상적으로 삭제 되었습니다.";
		}else {
			message = "삭제에 실패했습니다.";
		}
		return message;
	}
}
