package com.aurionpro.model;

public class Cylinder {

	private int radiius;
	private int height;
	private String name;
	private char code;
	public Cylinder(int radiius, int height, String name, char code) {
		super();
		this.radiius = radiius;
		this.height = height;
		this.name = name;
		this.code = code;
	}
	public int getRadiius() {
		return radiius;
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public char getCode() {
		return code;
	}
	@Override
	public String toString() {
		return "Cylinder [radiius=" + radiius + ", height=" + height + ", name=" + name + ", code=" + code + "]";
	}
	
	
}
