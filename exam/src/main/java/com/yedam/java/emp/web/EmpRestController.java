package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpReqVO;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@RestController // 화면과는 무관하게 동작
@CrossOrigin("*") // CORS관련 CROSS 허용 모든 경우에 대해서 허용하겠다. rest 서버의 경우 외부에서 들어오는 걸 받아줘야하므로~ *사용 -> 보안에 취약
public class EmpRestController {
	
	@Autowired
	EmpService service;
	
	// 전체조회
	@GetMapping("/emp")
	public List<EmpVO> empSelect(){
		// model이 필요없음
		return service.getEmpList(new EmpReqVO());
	}
	
	// 사원조회
	@GetMapping("/emp/{employeeId}")
	public EmpVO empFind(@PathVariable String employeeId) { // /emp/{employeeId}와 일치 해야함
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.getEmp(empVO);
	}
	
	// 사원등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmp(empVO);
		return empVO;
	}
	
	// 사원수정
	// 경로에서 접근하려는 사원정보(@PathVariable), body에서 수정하려는 정보(@RequestBody)
	@PutMapping("/emp/{employeeId}")
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO) {
		empVO.setEmployeeId(employeeId); // 비즈니스 로직에 보낼때는 합쳐서 보내야 함.
		service.updateEmp(empVO);
		return empVO;
	}
	
	// 사원삭제
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		
		return empVO;
	}
}
