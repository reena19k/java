package com.aurionpro.model;
public class Rectangle {
	private double height;
	private double width;
	private  ColorType color;
	
	
	public Rectangle(int i, int j, ColorType color) {
		this.height=i;
		this.width=j;
		this.color=color;
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


	public ColorType getColor() {
		return color;
	}
	
	public void setColor(ColorType color) {
		this.color= color;}

	public double calculateArea() {
		return height * width;
	}
	

}