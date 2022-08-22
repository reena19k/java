package com.aurionpro.test;

import com.aurionpro.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice("a", "cycle", 1000, 12, 2);
		System.out.println("Id is" +in.getId());
		System.out.println("calculate tax" +in.getAmount());
	
	}

}