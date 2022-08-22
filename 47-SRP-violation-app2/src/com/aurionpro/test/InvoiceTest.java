package com.aurionpro.test;



import com.aurionpro.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice("101", "manager", 1000, 10, 5);
	
		in.printInvoice();
	}

}