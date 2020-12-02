package com.encore.food.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.food.domain.StoreDTO;
import com.encore.food.repo.StoreDAO;

@Service
public class StoreServiceImpl implements StoreService {
	
	@Autowired
	private StoreDAO storeDao;

	@Override
	public List<StoreDTO> findAllMyStores(String id) throws Exception {
		return storeDao.findAllMyStores(id);
	}

	@Override
	public List<StoreDTO> findStoreBycategory(String category) throws Exception {
		return storeDao.findStoreBycategory(category);
	}

	@Override
	public void registerStore(StoreDTO store) throws Exception {
		storeDao.registerStore(store);
	}

	@Override
	public void updateStore(StoreDTO store) throws Exception {
		storeDao.updateStore(store);
	}

	@Override
	public void deleteStore(int store_id) throws Exception {
		storeDao.deleteStore(store_id);
	}

	@Override
	public List<StoreDTO> findAllStores() throws Exception {
		return storeDao.findAllStores();
	}

	@Override
	public List<StoreDTO> findStoreByName(String store_name) throws Exception {
		return storeDao.findStoreByName(store_name);
	}

	@Override
	public List<StoreDTO> detailStoreById(int store_id) throws Exception {
		return storeDao.detailStoreById(store_id);
	}

	@Override
	public void insertStore(StoreDTO store) throws Exception {
		storeDao.insertStore(store);
	}

	@Override
	public List<StoreDTO> myBestStores(String id) throws Exception {
		return storeDao.myBestStores(id);
	}

	@Override
	public void deletebestStore(int store_id) throws Exception {
		storeDao.deletebestStore(store_id);
	}


	
}
