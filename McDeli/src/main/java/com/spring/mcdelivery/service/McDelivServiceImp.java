package com.spring.mcdelivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mcdelivery.dao.UserDAO;
import com.spring.mcdelivery.dto.UserDTO;

@Service
public class McDelivServiceImp implements McDelivService {

	@Autowired
	private UserDAO dao;
	
	//회원가입
	@Override
	public void join(UserDTO dto) {
		
		dao.join(dto);
		
	}

	//이메일 중복체크
	@Override
	public String emailCheck(String inputEmail) {

		String dbEmail=dao.emailCheck(inputEmail);
		
		return dbEmail;
	}

	
	//로그인 
	@Override
	public UserDTO login(String inputPw) {

		UserDTO dto=dao.login(inputPw);
		

		
		return dto;
	}

}
