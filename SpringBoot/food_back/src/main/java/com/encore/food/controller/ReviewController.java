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

import com.encore.food.domain.ReviewDTO;
import com.encore.food.service.ReviewService;

@RestController
@RequestMapping("review")
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class ReviewController {

	@Autowired
	private ReviewService service;

	@GetMapping("/findReviewsByStoreId/{store_id}")
	public ResponseEntity findReviewsByStoreId(@PathVariable int store_id) throws Exception{
		List<ReviewDTO> reviews = service.findReviewsByStoreId(store_id);
		if(reviews.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		else return new ResponseEntity(reviews, HttpStatus.OK);
	}
	
	@PostMapping("/addReview")
	public ResponseEntity addReview(@RequestBody ReviewDTO review) throws Exception{
		service.addReview(review);
		return new ResponseEntity(HttpStatus.OK);
	}
	
//	@PutMapping("/updateReview")
//	public ResponseEntity updateReview(@RequestBody ReviewDTO review) throws Exception{
//		boolean result = service.updateReview(review);
//		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
//		return new ResponseEntity(HttpStatus.OK);
//	}
	
	@DeleteMapping("/deleteReview/{review_id}")
	public ResponseEntity deleteReview(@PathVariable int review_id) throws Exception{
		service.deleteReview(review_id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/findScore_avgByStoreId/{store_id}")
	   public ResponseEntity findScore_avgByStoreId(@PathVariable int store_id) throws Exception{
		boolean result = service.findScore_avgByStoreId(store_id);
		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
