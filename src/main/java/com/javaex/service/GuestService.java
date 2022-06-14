package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;
@Service
public class GuestService {

	//필드
	@Autowired
	private GuestbookDao guestbookDao;
	
	//생성자
	
	
	
	//메소드 gs
	
	
	
	//메소드 일반
	//리스트
	
	public List<GuestbookVo> getGuestList(){
		
		List<GuestbookVo> guestList = guestbookDao.getList();
		
		return guestList;
	}
	//등록하기
	
	public int guestInsert(GuestbookVo guestbookVo) {
		
		int count = guestbookDao.insert(guestbookVo);
		
		return count;
	}
	
	
}
