package com.aurionpro.model;

public class Circle {
	final private double radius;
	final private ColorType color;
	final private BorderType border;

	public Circle(double radius, ColorType color, BorderType border) {
		this.radius = validateValue(radius);
		this.color = color;
		this.border = border;
	}

	public Circle(double radius, ColorType color) {
		this(radius,color,BorderType.DOTTED);
	}

	public Circle(double radius) {
		this(radius, ColorType.GREEN, BorderType.DASHED);
	}

	public Circle() {
		this(50, ColorType.BLUE, BorderType.DOTTED);
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

	private double validateValue(double value) {
		if (value <= 0)
			return 1;
		if (value > 100)
			return 100;
		return value;
	}

	public double calculateArea() {
		return 3.14 * radius * radius;
	}

}