package com.aurionpro.test;
import com.aurionpro.model.BorderType;
import com.aurionpro.model.ColorType;
import com.aurionpro.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle mediumcircle = new Circle(77,ColorType.GREEN,BorderType.DOTTED);
				display(mediumcircle);
				System.out.println("--------------------");
		Circle bigcircle = new Circle(7,BorderType.DOTTED);		
				display(bigcircle);
				System.out.println("--------------------");
		Circle smallcircle = new Circle(67);
				display(smallcircle);
	}

	private static void display(Circle circle) {
			System.out.println("radius is" +circle.getRadius());
			System.out.println("border is" +circle.getBorder());
			System.out.println("color is" +circle.getColor());
			System.out.println("area is" +circle.Calculatearea());
		
	}
	

}