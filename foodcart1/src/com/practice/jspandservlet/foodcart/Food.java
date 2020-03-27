package com.practice.jspandservlet.foodcart;

public class Food {
	private int id;
	private String items;
	private float price;

	public Food(int id, String items, float price) {
		this.id = id;
		this.items = items;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
