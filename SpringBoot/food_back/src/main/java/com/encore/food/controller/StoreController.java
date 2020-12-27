package com.encore.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.food.domain.StoreDTO;
import com.encore.food.service.StoreService;

@RestController
@RequestMapping("store")
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	@PostMapping("registerStore")
	public ResponseEntity registerStore(@RequestBody StoreDTO dto) throws Exception{
		storeService.registerStore(dto);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("findAllMyStores/{id}")
	public ResponseEntity<List<StoreDTO>> findAllMyStores(@PathVariable String id) throws Exception{
		List<StoreDTO> stores = storeService.findAllMyStores(id);
		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(stores, HttpStatus.OK);
	}
	
	@GetMapping("findAllStores")
	public ResponseEntity<List<StoreDTO>> findAllStores() throws Exception{
		List<StoreDTO> stores = storeService.findAllStores();
		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(stores, HttpStatus.OK);
	}
	
	@GetMapping("findStoreByName/{store_name}")
	public ResponseEntity findStoreByName(@PathVariable String store_name) throws Exception{
		List<StoreDTO> stores = storeService.findStoreByName(store_name);
		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(stores, HttpStatus.OK);
	}
	
//	@GetMapping("findStoreBycategory/{category}")
//	public ResponseEntity findStoreBycategory(@PathVariable String category) throws Exception{
//		List<StoreDTO> stores = storeService.findStoreBycategory(category);
//		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
//		return new ResponseEntity(stores, HttpStatus.OK);
//	}
	
	@GetMapping("detailStoreById/{store_id}")
	public ResponseEntity detailStoreById(@PathVariable int store_id) throws Exception{
		List<StoreDTO> stores = storeService.detailStoreById(store_id);
		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(stores, HttpStatus.OK);
	}
	
//	@GetMapping("getStoreById/{store_id}")
//	public ResponseEntity getStoreById(@PathVariable int store_id) throws Exception{
//		List<StoreDTO> stores = storeService.getStoreById(store_id);
//		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
//		return new ResponseEntity(stores, HttpStatus.OK);
//	}
	
//	@PutMapping("updateStore")
//	public ResponseEntity updateStore(@RequestBody StoreDTO dto) throws Exception {
//		storeService.updateStore(dto);
//		return new ResponseEntity(HttpStatus.OK);
//	}
	
	@DeleteMapping("deleteStore/{store_id}")
	public ResponseEntity deleteStore(@PathVariable int store_id) throws Exception {
		storeService.deleteStore(store_id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("insertStore")
	public ResponseEntity insertStore(@RequestBody StoreDTO dto) throws Exception{
		storeService.insertStore(dto);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("myBestStores/{id}")
	public ResponseEntity<List<StoreDTO>> myBestStores(@PathVariable String id) throws Exception{
		List<StoreDTO> stores = storeService.myBestStores(id);
		if(stores.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(stores, HttpStatus.OK);
	}
	
	@DeleteMapping("deletebestStore/{store_id}")
	public ResponseEntity deletebestStore(@PathVariable int store_id) throws Exception {
		storeService.deletebestStore(store_id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
