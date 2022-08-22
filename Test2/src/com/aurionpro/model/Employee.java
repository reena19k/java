package com.aurionpro.model;

public class Employee implements Comparable<Employee> {
	private int id;
	private int name;
	private long phoenno;
	private char position;
	public Employee(int id, int name, long phoenno, char position) {
		super();
		this.id = id;
		this.name = name;
		this.phoenno = phoenno;
		this.position = position;
	}
	public int getId() {
		return id;
	}
	public int getName() {
		return name;
	}
	public long getPhoenno() {
		return phoenno;
	}
	public char getPosition() {
		return position;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoenno=" + phoenno + ", position=" + position + "]";
	}
	@Override
	public int compareTo(Employee o) {
		 if(this.getId()> e1.getId())
	            return 1;
	        else
	            return-1;		
	}

	
}
