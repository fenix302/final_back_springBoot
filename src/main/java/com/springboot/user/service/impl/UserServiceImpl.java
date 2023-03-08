package com.springboot.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.user.dao.UserRepository;
import com.springboot.user.service.UserService;
import com.springboot.user.vo.MemberVO;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public void insert(MemberVO memberVO) {
		
		repo.save(memberVO);
		
	}
	
	
}

