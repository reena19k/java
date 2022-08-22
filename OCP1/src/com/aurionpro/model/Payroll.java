package com.aurionpro.model;

public class Payroll {
	public void payRolling(Customer[] customer1) {
		for(Customer c:customer1) {
		c.getPaymentype().payAmount();
	}

}
}
