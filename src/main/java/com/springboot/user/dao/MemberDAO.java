package com.springboot.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.user.vo.MemberVO;


/**
 * Member 테이블 Repository
 *
 */
public interface MemberDAO extends JpaRepository<MemberVO, Integer> {
	
	// 회원가입여부를 확인하기 위한 MemberId, MemberPw로 단건 조회
	MemberVO findByIdAndPw(String id, String pw);
}