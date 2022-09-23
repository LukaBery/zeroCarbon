package com.zerocarbon.plastic.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerocarbon.plastic.dto.ApiResponse;
import com.zerocarbon.plastic.dto.UserDto;
import com.zerocarbon.plastic.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser")
	public ApiResponse<UserDto> getUser(String userId){
		
		UserDto userInfo = userService.getUser(userId);
		return ApiResponse.ok(userInfo);
	}

}
