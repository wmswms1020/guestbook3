package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestBookController {
	
	@RequestMapping(value="/list", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("list");
		
		GuestbookDao guestbookDao = new GuestbookDao();
		List<GuestbookVo> guestList = guestbookDao.getList();
		System.out.println(guestList);		
		
		
		return "WEB-INF/views/list.jsp";
	}
	
	//등록하기
	@RequestMapping(value="/add", method={RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute GuestbookVo vo) {
		System.out.println("add");
		
		GuestbookDao guestbookDao = new GuestbookDao();
		int count = guestbookDao.insert(vo);
		
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
