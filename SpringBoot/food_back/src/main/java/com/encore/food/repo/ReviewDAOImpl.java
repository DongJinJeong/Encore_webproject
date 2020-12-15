package com.encore.food.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.food.domain.ReviewDTO;



@Repository
public class ReviewDAOImpl implements ReviewDAO{
	
	private String ns = "ReviewMapper.";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void addReview(ReviewDTO review) throws Exception {
		sqlSession.insert(ns+"addReview", review);	
	}

	@Override
	public boolean updateReview(ReviewDTO review) throws Exception {
		int result=sqlSession.update(ns+"updateReview", review);
		if(result>0) return true;
		return false;
	}

	@Override
	public boolean deleteReview(int review_id) throws Exception {
		int result=sqlSession.delete(ns+"deleteReview", review_id);
		if(result>0) return true;
		return false;	
	}

	@Override
	public boolean findScore_avgByStoreId(int store_id) throws Exception {
		int result=sqlSession.update(ns+"findScore_avgByStoreId", store_id);
		if(result>0) return true;
		return false;
	}	

}
