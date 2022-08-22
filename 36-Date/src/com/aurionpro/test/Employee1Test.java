package com.aurionpro.test;

import com.aurionpro.model.Employee1;

public class Employee1Test {

	public static void main(String[] args) {
		Employee1 emp = new Employee1(101, "reena", 2220, "18-03-2022");
		printDetails(emp);
	}

	private static void printDetails(Employee1 emp) {
		System.out.println("id of employee is" +emp.id);
		System.out.println("name of employee is" +emp.name);
		System.out.println("employee date of joining is" +emp.doj);
		System.out.println("employee salary is" +emp.salary);
	}

}
