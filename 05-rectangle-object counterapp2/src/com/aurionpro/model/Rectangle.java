package com.aurionpro.model;

public class Rectangle {
	private double height;//instance variables
	private double width;
	public static int count;
	
		
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		count++;
		
	}
	public Rectangle(double height) {
		
		this.height = height;
		this.width = 10;
		count++;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	

	
}