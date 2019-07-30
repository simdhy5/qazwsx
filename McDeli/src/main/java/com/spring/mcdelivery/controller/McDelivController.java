package com.spring.mcdelivery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mcdelivery.dto.UserDTO;
import com.spring.mcdelivery.service.McDelivService;

@Controller
public class McDelivController {

	@Autowired
	private McDelivService service;
	
	//회원가입 주소 폼
	@RequestMapping("join-form")
	public String joinForm() {
		return "join-form";
	}
	
	//회원가입 계정 폼
	@RequestMapping("join-form2")
	public ModelAndView joinForm2(HttpServletRequest request) {
		//System.out.println(request.getParameter("inputAddr"));
		//System.out.println(request.getParameter("memo"));
		
		//세션으로 join-form.jsp 파라미터값 저장하기		
		HttpSession session=request.getSession();
		session.setAttribute("inputAddr", request.getParameter("inputAddr"));
		session.setAttribute("memo", request.getParameter("memo"));
		

		ModelAndView mav=new ModelAndView();
		mav.addObject(session);
		
		mav.setViewName("join-form2");
		
//		System.out.println(mav);
//		System.out.println((String)session.getAttribute("inputAddr"));
//		System.out.println((String)session.getAttribute("memo"));
		
		return mav;

	}
	

	//join-form에서 입력한 주소, 계정정보를  파라미터로 받아와서 UserDTO에 저장
	@RequestMapping("join-result")
	public String join(HttpServletRequest request) {
		
		//세션으로 join-form.jsp 파라미터값 가져오기
		HttpSession session=request.getSession();
//		System.out.println((String)session.getAttribute("inputAddr"));
//		System.out.println((String)session.getAttribute("memo"));		

		String sesAddr=(String)session.getAttribute("inputAddr");
		
		//join-form2.jsp에서 넘어온 값들을 dto에 저장하기
		//한번에 dto로 저장되는 방법은?
		String reqName=request.getParameter("inputName");
		String reqGend=request.getParameter("inputGend");
		String reqPhon=request.getParameter("inputPhon");
		String reqEmai=request.getParameter("inputEmai");
		String reqPw=request.getParameter("inputPw");
		
		UserDTO dto=new UserDTO();
		
		dto.setAddress(sesAddr);
		
		dto.setName(reqName);
		dto.setGender(reqGend);
		dto.setPhone(reqPhon);
		dto.setEmail(reqEmai);
		dto.setPw(reqPw);
		
		System.out.println(dto);
		
		//dto에 저장 완료, memo는 아직 세션에 저장되어 있음
		
		
		
		//dto를 service에 넘기기
		service.join(dto);
		
		return "join-result";
		
		
		
	}
}
