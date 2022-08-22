package com.aurionpro.model;

public class Circle {

	private float radius;
	private BorderType border;
	private ColorType color;

	public Circle(float radius,ColorType color,BorderType border) {

		this.radius = validateValue(radius);
		this.border = border;
		this.color = color;
	}

	public Circle(float radius) {

		this(radius, ColorType.RED,BorderType.SOLID);

		// this will call upper line no 10 constructor
		// this is called constructor chaining
		// calling constructor inside constructor

	}

	public Circle(float radius) {
		this(10,ColorType.RED,BorderType.DOTTED);

	}

	public ColorType getColor() {
		return color;
	}

	public float getRadius() {
		return radius;
	}

	public double calculateArea() {

		return (3.14*radius*radius);
	}

	private float validateValue(float value) {
		if (value <= 0)
			return 1;

		if (value >= 100)
			return 100;

		return value;
	}

	public BorderType getBorder() {
	
		return border;
	}

}