package com.aurionpro.model;

public class Employee {
	private String name;
	private int id;
	private String dept;
	
	
	public Employee(String name, int id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getDept() {
		return dept;
	}
	

	

}
