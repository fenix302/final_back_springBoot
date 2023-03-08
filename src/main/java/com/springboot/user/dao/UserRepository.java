package com.springboot.user.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.user.vo.MemberVO;


@Repository
public interface UserRepository extends CrudRepository<MemberVO, String>{
	
	MemberVO save(MemberVO memberVO);
	
}

