package com.yedam.java.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	// 기존 : yyyy/MM/dd -> yyyy-MM-dd로 변경
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date hireDate;
	
	private String jobId;
	private double salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;
}
