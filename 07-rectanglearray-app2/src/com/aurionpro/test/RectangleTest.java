package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle( 10, 20,ColorType.BLUE);

		printRectangle(smallRectangle);

		System.out.println("---------------------");

		Rectangle bigRectangle = new Rectangle(100, 20,ColorType.GREEN);
		printRectangle(bigRectangle);;
		
	}



	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height is :" + rectangle.getHeight());
		System.out.println("Width is :" + rectangle.getWidth());
		System.out.println("Area is :" + rectangle.calculateArea());
		System.out.println("The color of rectangle is" +rectangle.getColor());
	}
}

