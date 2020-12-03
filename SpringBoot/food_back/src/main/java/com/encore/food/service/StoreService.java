package com.encore.food.service;

import java.util.List;

import com.encore.food.domain.StoreDTO;

public interface StoreService {
	List<StoreDTO> findAllMyStores(String id) throws Exception;
	List<StoreDTO> findAllStores() throws Exception;
	List<StoreDTO> findStoreByName(String store_name) throws Exception;	
	List<StoreDTO> detailStoreById(int store_id) throws Exception;
	List<StoreDTO> getStoreById(int store_id) throws Exception;
	List<StoreDTO> findStoreBycategory(String category) throws Exception;
	void registerStore(StoreDTO store) throws Exception;
	void updateStore(StoreDTO store) throws Exception;
	void deleteStore(int store_id) throws Exception;
	void insertStore(StoreDTO store) throws Exception;
	List<StoreDTO> myBestStores(String id) throws Exception;
	void deletebestStore(int store_id) throws Exception;
}
