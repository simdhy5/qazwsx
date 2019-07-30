package com.spring.mcdelivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mcdelivery.dao.UserDAO;
import com.spring.mcdelivery.dto.UserDTO;

@Service
public class McDelivServiceImp implements McDelivService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public void join(UserDTO dto) {
		
		dao.join(dto);
		
	}

}
