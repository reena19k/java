package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		System.out.println("Enter Total No of Rectangle Objects");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Rectangle[] rectangles = new Rectangle[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter Height: ");
			Scanner sc1 = new Scanner(System.in);
			double ht = sc1.nextInt();

			System.out.println("Enter Width: ");
			double wdt = sc1.nextInt();

			System.out.println("Enter ColorType: ");
			String color = sc1.next();
			ColorType colour = ColorType.RED;
			try {
				colour = ColorType.valueOf(color.toUpperCase());
				}
			catch(IllegalArgumentException e) {
				colour = ColorType.RED; 
			}
			
			rectangles[i] = new Rectangle(ht, wdt, colour);

			System.out.println("-----------------------");
		}

		for (Rectangle rect : rectangles) {
			printdetails(rect);
			System.out.println("-------------------------");
		}

	}

	private static Rectangle rectangleInput() {

		return null;
	}

	private static void printdetails(Rectangle rectangles)

	{

		System.out.println(" width of  Rectangle: " + rectangles.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangles.getHeight());
		System.out.println(" color of  Rectangle: " + rectangles.getColor());

		System.out.println(" Area of  Rectangle: " + rectangles.calculateArea());

	}

}