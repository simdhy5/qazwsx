package com.spring.mcdelivery.dao;

import com.spring.mcdelivery.dto.UserDTO;

public interface UserDAO {

	public void join(UserDTO dto);

	public String emailCheck(String inputEmail);

	public UserDTO login(String inputPw);



}
