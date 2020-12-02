package com.encore.food.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.food.domain.StoreDTO;

@Repository
public class StoreDAOImpl implements StoreDAO {
	
	private String NS = "StoreMapper.";

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<StoreDTO> findAllMyStores(String id) throws Exception {
		return sqlSession.selectList(NS+"findAllMyStores", id);
	}

	@Override
	public List<StoreDTO> findStoreBycategory(String category) throws Exception {
		return sqlSession.selectOne(NS+"findStoreBycategory", category);
	}

	@Override
	public void registerStore(StoreDTO store) throws Exception {
		sqlSession.insert(NS+"registerStore", store);
	}

	@Override
	public void updateStore(StoreDTO store) throws Exception {
		sqlSession.update(NS+"updateStore", store);
	}

	@Override
	public void deleteStore(int store_id) throws Exception {
		sqlSession.delete(NS+"deleteStore", store_id);
	}

	@Override
	public List<StoreDTO> findAllStores() throws Exception {
		return sqlSession.selectList(NS+"findAllStores");
	}

	@Override
	public List<StoreDTO> findStoreByName(String store_name) throws Exception {
		return sqlSession.selectList(NS+"findStoreByName", store_name);
	}

	@Override
	public List<StoreDTO> detailStoreById(int store_id) throws Exception {
		return sqlSession.selectList(NS+"detailStoreById", store_id);
	}

	@Override
	public void insertStore(StoreDTO store) throws Exception {
		sqlSession.insert(NS+"insertStore", store);
	}

	@Override
	public List<StoreDTO> myBestStores(String id) throws Exception {
		return sqlSession.selectList(NS+"myBestStores", id);
	}

	@Override
	public void deletebestStore(int store_id) throws Exception {
		sqlSession.delete(NS+"deletebestStore", store_id);
	}


	
}
