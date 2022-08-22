package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {
	public static void main(String[] args) {
		Circle smallcircle = new Circle();
		setCircledetails(smallcircle,22);
		
		printcircle(smallcircle);
		
		System.out.println("-----------------");
		Circle bigcircle = new Circle();
		setCircledetails(bigcircle ,76);
		printcircle(bigcircle);
	}

	private static void printcircle(Circle circle ) {
		System.out.println("Radius is :" + circle.getRadius());
		System.out.println("Area is :" + circle.calculateArea());
	}

	private static void setCircledetails(Circle circle, int radius) {
		circle.setRadius(radius);
		
	}


}
