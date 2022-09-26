package com.zerocarbon.plastic.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerocarbon.plastic.dto.ApiResponse;
import com.zerocarbon.plastic.dto.UserDto;
import com.zerocarbon.plastic.service.UserService;

    /*회원 컨트롤러*/
@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	private UserService userService;
	
	/*회원 정보 조회*/
	@GetMapping("/getUser")
	public ApiResponse<UserDto> getUser(String userId){
		
		UserDto userInfo = userService.getUser(userId);
		return ApiResponse.ok(userInfo);
	}

}
