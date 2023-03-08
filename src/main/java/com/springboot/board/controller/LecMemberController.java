package com.springboot.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.board.model.LecMember;
import com.springboot.board.service.LecMemberService;

@CrossOrigin
@RestController
public class LecMemberController {
	@Autowired
	private LecMemberService lecMemberService;
	
	@RequestMapping(value = "/insertMember.do")
	public void insertMember(LecMember lecMember) {
		lecMemberService.insert(lecMember);
	}
}

