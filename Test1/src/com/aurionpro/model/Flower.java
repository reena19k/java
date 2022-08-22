package com.aurionpro.model;

public class Flower {
	private int name;
	private Character code;
	private int quantity;
	private int price;
	public int getName() {
		return name;
	}
	public Flower(int name, Character code, int quantity, int price) {
		super();
		this.name = name;
		this.code = code;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Flower() {
	}
	public Character getCode() {
		return code;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Flower [name=" + name + ", code=" + code + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	

}
