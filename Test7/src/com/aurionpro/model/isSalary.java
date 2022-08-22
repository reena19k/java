package com.aurionpro.model;

public class isSalary {
	public Employee emp;
	public int service;
	
	
	public isSalary(Employee e1,int service) {
		super();
		this.emp = emp;
		this.service=service;
	}






	public boolean isPermanannet() {
		
		if(service<=3)
		return false;
		else {
			return true;
		}
		
	}

}
