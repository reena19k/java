package com.aurionpro.model;

import java.util.ArrayList;

public class Calculate {
	private ArrayList<Cylinder> cylinders;
	private double totalarea;
	private double totalsurfaceare;
	private double totalvolume;

	public Calculate(ArrayList<Cylinder> cylinders) {
		super();
		this.cylinders = cylinders;
		for (Cylinder ca : cylinders) {
			this.totalarea += calculateArea(ca);
			this.totalsurfaceare += surfaceArea(ca);
			this.totalvolume += volume(ca);

		}
		printdetails();

	}

	private void printdetails() {
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
		System.out.println("total area is" + totalarea);
		System.out.println("total volume is " + totalvolume);
		System.out.println("total surface area is" + totalsurfaceare);
	}

	public double calculateArea(Cylinder c) {
		return (3.14 * (c.getRadiius()) * (c.getRadiius()));
	}

	public double surfaceArea(Cylinder c) {
		return (2 * 3.14 * (c.getRadiius()));
	}

	public double volume(Cylinder c) {
		return (3.14 * (c.getRadiius()) * (c.getRadiius()) * (c.getHeight()));
	}

}
