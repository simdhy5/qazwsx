package com.spring.mcdelivery.service;

import com.spring.mcdelivery.dto.UserDTO;

public interface McDelivService {

	public void join(UserDTO dto);

	public String emailCheck(String inputEmail);

	public UserDTO login(String inputPw);



}
