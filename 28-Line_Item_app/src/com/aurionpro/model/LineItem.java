package com.aurionpro.model;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	private double totalCost;
	public LineItem(int id, String name, int quantity, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalCost = calculateLineItem();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public double getTotalCost() {
		return totalCost;
	}
	private double calculateLineItem() {
		return quantity*unitPrice;
	}
	
}