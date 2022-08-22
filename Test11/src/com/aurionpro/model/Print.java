package com.aurionpro.model;

import java.util.ArrayList;

public class Print {
	

	private void printdetails(Calculate cs) {
		for (Cylinder ca : cylinders) {
			System.out.println("name of cylinder is" + ca.getName());
			System.out.println("code of cylinder is" + ca.getCode());
			System.out.println("radius of cylinder " + ca.getRadiius());
			System.out.println("height of cylinder  " + ca.getHeight());
			System.out.println("area of cylinder is" + calculateArea(ca));
			System.out.println("surface area is" + surfaceArea(ca));
			System.out.println("volume is " + volume(ca));
			System.out.println(("______"));
		}
}
