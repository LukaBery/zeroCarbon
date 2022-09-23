package com.zerocarbon.plastic.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zerocarbon.plastic.dto.UserDto;

@Repository
@Mapper
public interface UserDao {
	UserDto selectUser(String userId);

}
