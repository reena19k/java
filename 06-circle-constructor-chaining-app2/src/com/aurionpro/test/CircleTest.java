package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest{
	public static void main(String[] args) {
		Circle smallcircle = new Circle(100,ColorType.GREEN,BorderType.SOLID);
		printdetails(smallcircle);
		System.out.println("---------------");
		Circle bigcircle = new Circle(10,ColorType.GREEN);
		printdetails(bigcircle);
		System.out.println("---------------");
		Circle mediumcircle = new Circle(1);
		printdetails(mediumcircle);
				
}

	private static void printdetails(Circle circle) {
		System.out.println("radius is :" + circle.getRadius());
		System.out.println("Border is :" + circle.getBorder());
		System.out.println("Color is :" + circle.getColor());
		System.out.println("Area is :" + circle.CalculateArea());
		
	}
}