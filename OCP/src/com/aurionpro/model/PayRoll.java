package com.aurionpro.model;

public class PayRoll {
	public void calculateSalary(Employee emp){
	       emp.getSalaryType().calculateSalary();
	}
}
//this class join all class