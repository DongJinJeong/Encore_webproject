package com.encore.food.repo;

import com.encore.food.domain.UserDTO;

public interface UserDAO {
	public boolean registerUser(UserDTO user) throws Exception;
	public int idCheck(String id) throws Exception;
	public UserDTO login(UserDTO user) throws Exception;
}
