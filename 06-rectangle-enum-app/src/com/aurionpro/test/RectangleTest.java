package com.aurionpro.test;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(100, 67, ColorType.GREEN), new Rectangle(39,446, ColorType.GREEN),
				new Rectangle(53, 37, ColorType.BLUE), new Rectangle(344,33, ColorType.RED),
				new Rectangle(34,53,ColorType.RED), };

		for (Rectangle rect : rectangles) {
			print(rect);
			System.out.println("-------------------------");
		}

	}

	private static void print(Rectangle rectangles)

	{

		System.out.println(" width of  Rectangle: " + rectangles.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangles.getHeight());
		System.out.println(" color of  Rectangle: " + rectangles.getColor());

		System.out.println(" Area of  Rectangle: " + rectangles.calculateArea());

	}

}












Rectangle r1 = new Rectangle(100,76,GREEn)
Rectangle r2 = new Rectangle(10,76,GREEn)
Rectangle r3 = new Rectangle(17,76,GREEn)


Rectangle[] arr = {new Rectangle(100,76,GREEn), new Rectangle(10,76,GREEn),new Rectangle(17,76,GREEn)}
int a = 10
int b = 20
int c= 30
int[] arr= {10,20,30}




for(int i = 0;i<n;i++)
	
	
	for(int i:arr)
		for each integer i in array
		print(i)