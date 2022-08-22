package com.aurionpro.model;

public class Customer {
	private String name;
	private int purchaseamount;
	private iPayment paymentype;
	public String getName() {
		return name;
	}
	
	public int getPurchaseamount() {
		return purchaseamount;
	}
	
	public iPayment getPaymentype() {
		return paymentype;
	}

	public Customer(String name, int purchaseamount, iPayment paymentype) {
		super();
		this.name = name;
		this.purchaseamount = purchaseamount;
		this.paymentype = paymentype;
	}

	
	
}
