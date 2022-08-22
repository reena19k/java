package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10,20);
		Rectangle rectangle2 = new Rectangle(10,20);
		System.out.println(rectangle1.equals(rectangle2));
		System.out.println(rectangle1.hashCode());
		System.out.println(rectangle2.hashCode());
		
}
}