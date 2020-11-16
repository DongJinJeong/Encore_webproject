package com.encore.food.repo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.food.domain.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	private String NS = "UserMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public boolean registerUser(UserDTO user) throws Exception {
		int result = sqlSession.insert(NS+"registerUser", user);
		if(result > 0) return true;
		return false;
	}

	@Override
	public int idCheck(String id) throws Exception {
		return sqlSession.selectOne(NS+"idCheck", id);
	}

	@Override
	public boolean updateUser(UserDTO user) throws Exception {
		int result = sqlSession.update(NS+"updateUser", user);
		if(result > 0) return true;
		return false;
	}

	@Override
	public UserDTO login(UserDTO user) throws Exception {
		return sqlSession.selectOne(NS+"login", user);
	}

}
