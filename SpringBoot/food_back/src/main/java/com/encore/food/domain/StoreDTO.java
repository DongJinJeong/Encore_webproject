package com.encore.food.domain;

import org.apache.ibatis.type.Alias;

@Alias("store")
public class StoreDTO {
	private int store_id;
	private String store_img;
	private String store_name;
	private String store_address;
	private String store_phone;
	private String category;
	private String parking;
	private String opentime;
	private String closetime;
	private String dayoff;
	private String id;
	private double score_avg;
	private String menu1;
	private String price1;
	private String menu2;
	private String price2;
	private String menu3;
	private String price3;
	
	public StoreDTO() {
		
	}

	public StoreDTO(int store_id, String store_img, String store_name, String store_address, String store_phone,
			String category, String parking, String opentime, String closetime, String dayoff, String id,
			double score_avg, String menu1, String price1, String menu2, String price2, String menu3, String price3) {
		super();
		this.store_id = store_id;
		this.store_img = store_img;
		this.store_name = store_name;
		this.store_address = store_address;
		this.store_phone = store_phone;
		this.category = category;
		this.parking = parking;
		this.opentime = opentime;
		this.closetime = closetime;
		this.dayoff = dayoff;
		this.id = id;
		this.score_avg = score_avg;
		this.menu1 = menu1;
		this.price1 = price1;
		this.menu2 = menu2;
		this.price2 = price2;
		this.menu3 = menu3;
		this.price3 = price3;
	}
	
	public double getScore_avg() {
		return score_avg;
	}
	
	public void setScore_avg(double score_avg) {
		this.score_avg = score_avg;
	}
	
	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public String getStore_img() {
		return store_img;
	}

	public void setStore_img(String store_img) {
		this.store_img = store_img;
	}
	
	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getStore_address() {
		return store_address;
	}

	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}

	public String getStore_phone() {
		return store_phone;
	}

	public void setStore_phone(String store_phone) {
		this.store_phone = store_phone;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public String getDayoff() {
		return dayoff;
	}

	public void setDayoff(String dayoff) {
		this.dayoff = dayoff;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getMenu1() {
		return menu1;
	}
	public void setMenu1(String menu1) {
		this.menu1 = menu1;
	}
	public String getPrice1() {
		return price1;
	}
	public void setPrice1(String price1) {
		this.price1 = price1;
	}
	public String getMenu2() {
		return menu2;
	}
	public void setMenu2(String menu2) {
		this.menu2 = menu2;
	}
	public String getPrice2() {
		return price2;
	}
	public void setPrice2(String price2) {
		this.price2 = price2;
	}
	public String getMenu3() {
		return menu3;
	}
	public void setMenu3(String menu3) {
		this.menu3 = menu3;
	}
	public String getPrice3() {
		return price3;
	}
	public void setPrice3(String price3) {
		this.price3 = price3;
	}

	@Override
	public String toString() {
		return "StoreDTO [store_id=" + store_id + ", store_img=" + store_img + ", store_name=" + store_name
				+ ", store_address=" + store_address + ", store_phone=" + store_phone + ", category=" + category
				+ ", parking=" + parking + ", opentime=" + opentime + ", closetime=" + closetime + ", dayoff=" + dayoff
				+ ", id=" + id + ", score_avg=" + score_avg + ", menu1=" + menu1 + ", price1=" + price1 + ", menu2="
				+ menu2 + ", price2=" + price2 + ", menu3=" + menu3 + ", price3=" + price3 + "]";
	}
}