package com.aurionpro.model;

public class Corn {
	private int id;
	private String name;
	private double protein;
	private int price;
	public Corn(int id, String name, double protein, int price) {
		this.id = id;
		this.name = name;
		this.protein = protein;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getProtein() {
		return protein;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Corn [id=" + id + ", name=" + name + ", protein=" + protein + ", price=" + price + "]";
	}
	
	

}
