package com.aurionpro.model;

public class Main {
	public static void main(String[] args) {
		 Employee e1 = new Employee();
	        e1.setName("Kishor");
	        Commission commission = new Commission();
	        e1.setSalaryType(commission);
	      //  PayRoll p1 = new PayRoll();
	        e1.showSalary();
	    }
	}


