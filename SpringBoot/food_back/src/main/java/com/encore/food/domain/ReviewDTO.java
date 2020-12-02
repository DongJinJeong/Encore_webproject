package com.encore.food.domain;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

public class ReviewDTO implements Serializable {
	private int review_id;
	private String content;
	private int score;
	private String id;
	private int store_id;

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public ReviewDTO() {
	}

	public ReviewDTO(int review_id, String content, int score, String id, int store_id) {
		super();
		this.review_id = review_id;
		this.content = content;
		this.score = score;
		this.id = id;
		this.store_id = store_id;
	}

	@Override
	public String toString() {
		return "ReviewDto [review_id=" + review_id + ", content=" + content + ", score=" + score + ", id="
				+ id + ", store_id=" + store_id + "]";
	}

}
