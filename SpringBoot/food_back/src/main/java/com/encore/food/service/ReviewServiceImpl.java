package com.encore.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.food.domain.ReviewDTO;
import com.encore.food.repo.ReviewDAO;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	private ReviewDAO reviewDao;

	@Override
	public void addReview(ReviewDTO review) throws Exception {
		reviewDao.addReview(review);
	}

	@Override
	public boolean updateReview(ReviewDTO review) throws Exception {
		return reviewDao.updateReview(review);
	}

	@Override
	public boolean deleteReview(int review_id) throws Exception {
		return reviewDao.deleteReview(review_id);
	}

	@Override
	public boolean findScore_avgByStoreId(int store_id) throws Exception {
		return reviewDao.findScore_avgByStoreId(store_id);
	}

}
