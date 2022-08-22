package com.aurionpro.test;
import com.aurionpro.model.BorderType;
import com.aurionpro.model.ColorType;
import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {

		Circle smallRectangle = new Circle(20,ColorType.BLUE,BorderType.DOTTED);

		display(smallRectangle);

		// System.out.println("-------------------------");

		//Circle bigRectangle = new Circle(35, 85);
	//	display(bigRectangle);

		System.out.println("-------------------------");

		//Circle mediumRectangle = new Circle(75);
		//display(mediumRectangle);

	}

	private static void display(Circle circle)

	{

		System.out.println(" radius is: " + circle.getRadius());
		System.out.println(" border is: " + circle.getBorder());
		System.out.println("color is: " + circle.getColor());

		System.out.println(" Area : " + circle.calculateArea());

	}

}