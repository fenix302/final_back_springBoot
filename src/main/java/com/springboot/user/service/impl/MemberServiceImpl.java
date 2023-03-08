package com.springboot.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.user.dao.MemberDAO;
import com.springboot.user.service.MemberService;
import com.springboot.user.vo.MemberVO;


@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	/**
	 * 아이디, 패스워드로 회원 조회
	 * @param memberVO
	 * @throws Exception
	 */
	@Override
	public MemberVO selectMemberByIdByPw(MemberVO memberVO) throws Exception {
		MemberVO resultVO = memberDAO.findByIdAndPw(memberVO.getId(), memberVO.getPw());
		return resultVO;
	}
	
	
}
