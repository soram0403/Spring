package com.yedam.dsr.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.dsr.user.mapper.UserMapper;
import com.yedam.dsr.user.service.UserService;
import com.yedam.dsr.user.service.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;
	
	@Override
	public List<UserVO> selectUserList() {
		return mapper.getUserList();
	}

	@Override
	public UserVO selectUser(String userId) {
		return mapper.getUserInfo(userId);
	}

	@Override
	public UserVO insertUser(UserVO vo) {
		return mapper.insertUser(vo);
	}

	@Override
	public UserVO updateUser(UserVO vo) {
		return mapper.updateUser(vo);
	}

	@Override
	public UserVO deleteUser(String userId) {
		return mapper.deleteUser(userId);
	}

	@Override
	public UserVO loginAdmin(UserVO vo) {
		return mapper.loginUser(vo);
	}

}
