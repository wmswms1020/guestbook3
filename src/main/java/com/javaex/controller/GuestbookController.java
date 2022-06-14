package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.service.GuestService;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestbookController {
	
	@Autowired
	private GuestService guestService;
	
	
	
	@RequestMapping(value="/list", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("list");
		
		
		List<GuestbookVo> guestList = guestService.getGuestList();
		System.out.println(guestList);		
		
		model.addAttribute("guestList",guestList);
		
		return "list";
	}
	
	//등록하기
	@RequestMapping(value="/add", method={RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("add");
		
		
		int count = guestService.guestInsert(guestbookVo);
		
		System.out.println(count);
		
		
		return "redirect:list";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//테스트용 메소ㅓ드
	@RequestMapping(value="/test", method= {RequestMethod.GET, RequestMethod.POST})
	public String test() {
		System.out.println("test");
		
		return "WEB-INF/views/index.jsp";
		
	}
	
	
}
