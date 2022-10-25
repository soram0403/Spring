package com.yedam.dsr.user.service;

import java.util.List;

public interface UserService {
	// 전체조회
	public List<UserVO> selectUserList();
	
	// 단건조회
	public UserVO selectUser(String userId);
	
	// 등록
	public UserVO insertUser(UserVO vo);
	
	// 수정
	public UserVO updateUser(UserVO vo);
	
	// 삭제
	public UserVO deleteUser(String userId);
	
	// 관리자 로그인 확인
	public UserVO loginAdmin(UserVO vo);
}
