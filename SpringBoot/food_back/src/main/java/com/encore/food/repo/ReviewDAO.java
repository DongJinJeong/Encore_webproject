package com.encore.food.repo;

import java.util.List;

import com.encore.food.domain.ReviewDTO;

public interface ReviewDAO {
	public List<ReviewDTO> findAllReview() throws Exception;
	public List<ReviewDTO> findReviewsByStoreId(int store_id) throws Exception;
	public void addReview(ReviewDTO review) throws Exception;
	public boolean updateReview(ReviewDTO review) throws Exception;
	public boolean deleteReview(int review_id) throws Exception;	
	public boolean findScore_avgByStoreId(int store_id) throws Exception;
}
