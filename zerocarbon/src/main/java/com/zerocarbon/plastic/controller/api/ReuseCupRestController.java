package com.zerocarbon.plastic.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerocarbon.plastic.dto.ApiResponse;
import com.zerocarbon.plastic.dto.ReuseCupDto;
import com.zerocarbon.plastic.service.ReuseCupService;

@RestController
@RequestMapping("/reuse")
public class ReuseCupRestController {

	@Autowired
	ReuseCupService reuseCupService;
	
	@GetMapping("/getList")
	public ApiResponse<List<ReuseCupDto>> getCupList(){
		
		List<ReuseCupDto> cupInfo = reuseCupService.getCup();
		return ApiResponse.ok(cupInfo);
	}

}
