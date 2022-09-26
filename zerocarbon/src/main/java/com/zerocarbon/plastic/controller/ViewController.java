package com.zerocarbon.plastic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    /*뷰 페이지 컨트롤러*/
@Controller
public class ViewController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
