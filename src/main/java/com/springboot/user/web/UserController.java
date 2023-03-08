package com.springboot.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.service.UserService;
import com.springboot.user.vo.MemberVO;


@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/naver.do")
	public void insert(MemberVO memberVO) {
		service.insert(memberVO);
	}
	
	
}

