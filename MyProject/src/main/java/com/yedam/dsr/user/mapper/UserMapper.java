package com.yedam.dsr.user.mapper;

import java.util.List;

import com.yedam.dsr.user.service.UserVO;

public interface UserMapper {
	// 전체조회
	public List<UserVO> getUserList();
	
	// 단건조회
	public UserVO getUserInfo(String userId);
	
	// 등록
	public UserVO insertUser(UserVO vo);
	
	// 수정
	public UserVO updateUser(UserVO vo);
	
	// 삭제
	public UserVO deleteUser(String userId);
	
	// 로그인
	public UserVO loginUser(UserVO vo);
}
