package com.zerocarbon.plastic.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class UserDto {
	private String userId;
	private String userPwd;
	private String userName;
	private String userPhone;
	private String salt;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Date joinDate;

}
