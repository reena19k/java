package com.aurionpro.model;

import java.lang.*;
import java.util.Comparator;

public class Employee2 {
	int empId;
	String empName;
	double salary;

	public Employee2(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee2() {

	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", salary=" + salary + '}';
	}
}
