package com.aurionpro.model;

public class Employeetest {
	public static void main(String[] args) {
		Employee e1= new Employee("aa", 24, "acc");
		isSalary s = new isSalary(e1,9);
		System.out.println(s.isPermanannet());
		
		
		
		Calculatepay c = new Calculatepay(e1,'A');
		System.out.println(c.calculatePay1());
		
	}

}
