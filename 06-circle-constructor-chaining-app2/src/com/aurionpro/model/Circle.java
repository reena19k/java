package com.aurionpro.model;

public class Circle {
	private double radius;// instance variables
	private ColorType color;
	private BorderType border;
	
	public Circle(double radius, ColorType color, BorderType border) {
	this.radius  = radius;
	this.color = color;
	this.border = border;
	}
	public Circle(double radius, ColorType color) {
		this(radius,color,BorderType.DASHED);
	}
	public Circle(double radius) {
		this(radius,ColorType.BLUE,BorderType.DOTTED);
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
	public double CalculateArea()
	{
		return (3.14*radius*radius);
	}
	}
	
	
	