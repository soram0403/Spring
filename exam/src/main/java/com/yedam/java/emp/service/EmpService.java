package com.yedam.java.emp.service;

import java.util.List;

public interface EmpService {
	public EmpVO getEmp(EmpVO vo);
	public List<EmpVO> getEmpList(EmpReqVO vo);
	public List<EmpVO> getEmpByDept(String[] dept);
	int insertEmp(EmpVO vo);
	int updateEmp(EmpVO vo);
	int deleteEmp(EmpVO vo);
}

