package com.aurionpro.model;

public class Students {
	private int id;
	private String name;
	private Location loc;
	
	public Students(int id, String name, Location loc) {
		
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	public Students() {
		
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Location getLoc() {
		return loc;
	}
	

}
