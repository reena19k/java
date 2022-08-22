package com.aurionpro.model;

public class Circle {
	private double radius;
	private ColorType color;
	private BorderType border;
	
	public Circle(double radius,ColorType color,BorderType border ) {
		this.radius = validateValue(radius);
		this.border =border;
		this.color = color;
	}
	private double validateValue(double value) {
		if (value <= 0)
			return 1;

		if (value >= 100)
			return 100;
		return value;
		
	}
	public Circle(double radius,BorderType border ) {
		this.radius = radius;
		this.border = border;
	}
	public Circle(double radius ) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public ColorType getColor() {
		return color;
	}
	public BorderType getBorder() {
		return border;
	}
	
	public double Calculatearea()
	{
		return (3.14*radius*radius);
	}
	
	
}
