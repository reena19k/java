package com.aurionpro.model;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee (){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public java.lang.String toString() {
		return "Account{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
	}
}
