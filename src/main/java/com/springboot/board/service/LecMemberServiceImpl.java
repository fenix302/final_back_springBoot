package com.springboot.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.board.model.LecMember;
import com.springboot.board.repository.LecMemberRepository;

@Service("lecMemberService")
public class LecMemberServiceImpl implements LecMemberService{

	@Autowired
	private LecMemberRepository repo;
	
	@Override
	public void insert(LecMember lecMember) {
		repo.save(lecMember);
	}

}
