package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {
	public static void main(String[] args) {
		Circle smallcircle = new Circle();
		setdetails(smallcircle,63);
		Circle bigcircle = new Circle();
		setdetails(bigcircle,70);
		printCircle(smallcircle);
		printCircle(bigcircle);	
	}
	private static void setdetails(Circle circle,double radius)
	{
		circle.setRadius(radius);
	}

	private static void printCircle(Circle circle) {
		System.out.println("radius is :" + circle.getRadius());
		
		System.out.println("Area is :" + circle.calculateArea());
	}
}















Circle c1=new Circle()
c1.setRadius(22)


add(int m,int n)

