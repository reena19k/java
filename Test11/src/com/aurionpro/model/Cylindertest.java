package com.aurionpro.model;

import java.util.ArrayList;

public class Cylindertest {

	public static void main(String[] args) {
		
		ArrayList<Cylinder> cylinders = new ArrayList<>();
		cylinders.add(new Cylinder(44, 21, "tedhamedha", 's'));
		cylinders.add(new Cylinder(23, 45, "gol", 'x'));
		Calculate c = new Calculate(cylinders);
	}

}
