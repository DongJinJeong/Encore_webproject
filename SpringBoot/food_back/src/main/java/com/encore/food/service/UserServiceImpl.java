package com.encore.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.food.domain.UserDTO;
import com.encore.food.repo.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean registerUser(UserDTO user) throws Exception {
		return userDAO.registerUser(user);
	}

	@Override
	public int idCheck(String id) throws Exception {
		return userDAO.idCheck(id);
	}

	@Override
	public UserDTO login(UserDTO user) throws Exception {
		return userDAO.login(user);
	}
	
}
