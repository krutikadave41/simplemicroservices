package com.example.demo.dto;

public class ItemResponse {

	private int id;
	private String name;
	private String brand;
	private String rating;
	
	
	public ItemResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ItemResponse(int id, String name, String brand, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	
}
