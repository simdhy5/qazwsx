package com.spring.mcdelivery.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mcdelivery.dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO {

	@Autowired
	private SqlSession session;
	
	//회원가입
	@Override
	public void join(UserDTO dto) {
		
		System.out.println(dto);
		
		session.insert("user.join", dto);
		
	}

	//이메일 중복확인
	@Override
	public String emailCheck(String inputEmail) {

		String dbEmail=session.selectOne("user.emailCheck", inputEmail);
		
		return dbEmail;
	}

	
	//로그인
	@Override
	public UserDTO login(String inputPw) {
		
		UserDTO dto=session.selectOne("user.login",inputPw);
		return dto;
	}

}
