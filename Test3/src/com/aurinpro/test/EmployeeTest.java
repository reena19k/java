package com.aurinpro.test;

import com.aurinpro.model.Emoloyee;

public class EmployeeTest {

	public static void main(String[] args) {
		Emoloyee e1 = new Emoloyee(1, "reena", 100);
		Emoloyee e2= new Emoloyee(2,"sss",1234);
		Emoloyee e3 = new Emoloyee(3,"erf",245);
		e1.incSalary();
		e2.incSalary();
		e3.incSalary();
		
	}

}
