package com.yedam.dsr.user.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserVO {
	private String userId;
	private String userName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userDate;
	private String userPassword;
	private String userNic;
	private String userPhone;
	private String userEmail;
	private String userType;
}
