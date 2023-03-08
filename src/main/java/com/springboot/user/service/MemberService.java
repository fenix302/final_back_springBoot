package com.springboot.user.service;

import com.springboot.user.vo.MemberVO;


public interface MemberService {
	
	/**
	 * 아이디, 패스워드로 회원 조회
	 * @param memberVO
	 * @throws Exception
	 */
	MemberVO selectMemberByIdByPw(MemberVO memberVO) throws Exception;
	
}
