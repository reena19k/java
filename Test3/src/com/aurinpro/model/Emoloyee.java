package com.aurinpro.model;

public class Emoloyee {
	public int id;
	public String name;
	public double salary;
	
	public Emoloyee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}


	public void incSalary() {
		this.salary=salary*10;
		System.out.println("increment salary is" +salary);
	}
	
	
	
}
