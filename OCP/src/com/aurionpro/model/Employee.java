package com.aurionpro.model;

public class Employee {
	String name;
	IpayClassification salaryType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IpayClassification getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(IpayClassification salaryType) {
		this.salaryType = salaryType;
	}
	public void showSalary() {
		salaryType.calculateSalary();
	}
}