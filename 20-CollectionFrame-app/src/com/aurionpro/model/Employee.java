package com.aurionpro.model;

public class Employee {
	public int id;
	public String name;
	public double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
	}
}
