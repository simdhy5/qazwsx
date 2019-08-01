package com.spring.mcdelivery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletWebRequest;
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





	//아이디 중복확인
	//form에서 입력받은 이메일을 db로 보내서 그 이메일과 일치하는 이메일을 가지고 옴 (dbEmail)
	//그리고 여기서는 db에서 가져온 이메일이 존재하는 경우 결과에 1을 저장 -> 리턴값은 정수형
	@RequestMapping(value="emailChk", method=RequestMethod.POST)
	@ResponseBody
	public int emailCheck(@RequestParam String inputEmail) { //ajax로 넘어오는 데이터를 @RequestParam으로 받음


		System.out.println(inputEmail);

		String dbEmail=service.emailCheck(inputEmail);

		//result의 기본값? 혹시라도 제대로 안 돌아갈경우 기본적으로 중복이 됐다고 하는게 낫?

		int result=0;

		if (inputEmail != null) {
			if (dbEmail != null) { //db에 해당 이메일이 있는 경우 -> 중복 되는 경우 -> 사용불가능한 이메일인 경우
				result=1;
			}
		}

		return result;
	}
	
	
	
	//로그인 확인
	//ajax로 넘어온 비번을 db로 보내서 이 비번에 맞는 이메일을 가져옴
	//그리고 이 이메일(dbEmail)이 입력받은 이메일이랑 같은지 비교 -> 같으면 1 리턴 -> 리턴타입 : 정수형
	@RequestMapping(value="login", method=RequestMethod.POST)
	@ResponseBody
	public int login(@RequestParam String inputPw, String inputEmail) {
//		System.out.println(inputPw);
//		System.out.println(inputEmail);
		
		//ajax로 받아온 비밀번호를 넘겨서 db에서 그 비번에 맞는 정보들 가져오기 -> dto로 가져와야 다른것들 모두 사용 가능
		UserDTO dto=new UserDTO();
		dto=service.login(inputPw);
		

		
		int result=0;
		
//		if (dto==null) {
//			result=0;
//		} 
		
		//db에서 넘어온 dto가 null일때 처리!!!
		System.out.println("dto에 뭐 들어있?" + dto);
		System.out.println("dto가 비었?" + StringUtils.isEmpty(dto)); //null이면 true

		if(StringUtils.isEmpty(dto)) { //비번 틀린 경우
			result=0;
		} else {
			if (dto.getEmail().equals(inputEmail)) { //비번 맞는 경우 -> 세션만들기
				result=1;
			}			
		}		
		return result;

		
		

	}
	
}
