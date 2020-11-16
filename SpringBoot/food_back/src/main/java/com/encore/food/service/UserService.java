package com.encore.food.service;

import com.encore.food.domain.UserDTO;

public interface UserService {
	public boolean registerUser(UserDTO user) throws Exception;
	public int idCheck(String id) throws Exception;
	public  boolean updateUser(UserDTO user) throws Exception;
	public UserDTO login(UserDTO user) throws Exception;
}
