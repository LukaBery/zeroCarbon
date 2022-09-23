package com.zerocarbon.plastic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerocarbon.plastic.dao.UserDao;
import com.zerocarbon.plastic.dto.UserDto;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	public UserDto getUser(String userId) {
		return (UserDto) userDao.selectUser(userId);
		
	}

}
