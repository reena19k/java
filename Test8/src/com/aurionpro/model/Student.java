package com.aurionpro.model;

public class Student {
	private int id;
	private String name;
	private int div;
	private double marks;
	private String location;
	public Student(int id, String name, int div, double marks, String location) {
		super();
		this.id = id;
		this.name = name;
		this.div = div;
		this.marks = marks;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDiv() {
		return div;
	}
	public double getMarks() {
		return marks;
	}
	public String getLocation() {
		return location;
	}
	
	
}

