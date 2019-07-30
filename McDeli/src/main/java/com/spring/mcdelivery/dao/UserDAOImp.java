package com.spring.mcdelivery.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mcdelivery.dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO {

	@Autowired
	private SqlSession session;
	
	@Override
	public void join(UserDTO dto) {
		
		System.out.println(dto);
		
		session.insert("user.join", dto);
		
	}

}
