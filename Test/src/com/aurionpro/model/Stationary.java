package com.aurionpro.model;

public class Stationary {
	private String name;
	private int price;
	private String Brand;
	private boolean warranty;
	public Stationary(String name, int price, String brand, boolean warranty) {
		super();
		this.name = name;
		this.price = price;
		Brand = brand;
		this.warranty = warranty;
	}
	public Stationary() {
		
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return Brand;
	}
	public boolean isWarranty() {
		return warranty;
	}
	@Override
	public String toString() {
		return "Stationary [name=" + name + ", price=" + price + ", Brand=" + Brand + ", warranty=" + warranty + "]";
	}
	

}
