package com.springboot.user.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.service.MemberService;
import com.springboot.user.vo.MemberVO;

@CrossOrigin
@RestController
public class MemberController {

	@Resource(name="memberService")
	private MemberService memberService;
	
	/**
	 * 로그인 
	 * @param memberVO
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @throws Exception
	 */
	@RequestMapping(value="/loginAction.do")
	public @ResponseBody String loginAction(@ModelAttribute("memberVO")MemberVO memberVO, HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) throws Exception{
		String result = "N";
		
		try {
			MemberVO resultVO = memberService.selectMemberByIdByPw(memberVO);
			
			// 멤버의 정보가 있다면, 멤버의 이름을 리턴
			if(resultVO != null) {
				result = resultVO.getName();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// @RequestBody 는 HttpServletRequest request(요청) 사항의 Body 전송 데이터를 자바 객체로 변환할 때 사용함.
    // 참고로, @ResponseBody 의 경우, 자바 객체를 HttpServletResponse response(응답) 사항의 Body 전송 데이터로 변환할 때 사용함.
	@RequestMapping(value = "/signin")
	public boolean signIn(@RequestBody MemberVO memberVO, HttpServletRequest request) throws Exception {
	MemberVO memberVO1;
	try {
		memberVO1 = memberService.selectMemberByIdByPw(memberVO);
		if(memberVO != null) {
			if (memberVO1.getPw().equals(memberVO1.getPw())) {
				return true;
			}
		}
	} catch (NullPointerException e) {
		memberVO1 = null;
	}
	return false;
	}
	
}

