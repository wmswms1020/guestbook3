package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GuestBookController {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//테스트용 메소ㅓ드
	@RequestMapping(value="/test", method= {RequestMethod.GET, RequestMethod.POST})
	public String test() {
		System.out.println("test");
		
		return "WEB-INF/views/index.jsp";
		
	}
	
	
}
