package com.aurionpro.model;

public class Circle {
	private double radius;
	
	


	public double getRadius() {
		return radius;
	}




	public void setRadius(double radius) {
		this.radius = radius;
	}




	public double calculateArea() {
		//double area = height * width;//local variables
		return 3.14*radius*radius;
	}
}