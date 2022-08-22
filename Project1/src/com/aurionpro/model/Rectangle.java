package com.aurionpro.model;

import com.aurionpro.model

public class Rectangle {

	private float width;
	private float height;
	private ColorType color;

	public Rectangle(float width, float height,ColorType)
	{

		this.width = validateValue(width);
		this.height = validateValue(height);
		this.Color = color;
	}


	private float validateValue(float value) {
		if (value <= 0)
			return 1;

		if (value >= 100)
			return 100;

		return value;
	}

	public Color getColor() {
		return Color;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public float calculateArea() {

		return (width * height);
	}

}