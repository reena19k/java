package com.aurionpro.model;

public class Gpay implements iPayment {

	@Override
	public void payAmount() {
		System.out.println("gpay is running");
	}

}
