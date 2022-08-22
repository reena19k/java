package com.aurionpro.model;

public class Main {

	public static void main(String[] args) {
		Bharatpay bpay = new Bharatpay();
		Gpay gpay = new Gpay();
		Phonepya phonepay = new Phonepya();
		Customer[] customer1 = { new Customer("dhe", 281, gpay), new Customer("wjd", 19362, phonepay), new Customer("ehe", 2726, bpay) };

		Payroll payroll1 = new Payroll();
		payroll1.payRolling(customer1);

	}

}