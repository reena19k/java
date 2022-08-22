package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {
	public static void main(String[] args) {
		Circle[] circles = { new Circle(20, ColorType.BLUE, BorderType.DOTTED),
				new Circle(70, ColorType.BLUE),
				new Circle(80),
				new Circle(90, ColorType.GREEN, BorderType.DASHED), 
				new Circle()
				};

		for (Circle c : circles) {
			printCircle(c);
		}
	}

	private static void printCircle(Circle circle) {
		System.out.println("Radius of Circle is " + circle.getRadius());
		System.out.println("Color of Circle is " + circle.getColor());
		System.out.println("Border of Circle is " + circle.getBorder());
		System.out.println("Area of Circle is " + circle.calculateArea());
		System.out.println("-------------------------------------------");
	}
}