package com.aurionpro.model;

import java.util.*;

public class Invoice {

	private ArrayList<Product> p;
	public double Totalamount;

	public Invoice(ArrayList<Product> p) {
		super();
		this.p = p;
		for(Product pda : p) {
			this.Totalamount+=calculateTotal(pda);
		}
		printBillDescription();
	}

	public void printBillDescription() {
		{
			for (Product pda : p) {
				System.out.println("ID " + pda.getId());
				System.out.println("Description " + pda.getDescription());
				System.out.println("Amount " + pda.getAmount());
				System.out.println("Tax " + calculateTax(pda));
				System.out.println("Discount " + calculateDiscount(pda));
				System.out.println("Total " + calculateTotal(pda));
				System.out.println("-------------");

			}
			System.out.println("Total bill is " +Totalamount);

		}
	}

	public double calculateTax(Product pro) {
		return (pro.getAmount() * pro.getTax()) / 100;
	}

	public double calculateDiscount(Product pro) {
		return (pro.getAmount() * pro.getDiscountPercent()) / 100;
	}

	public double calculateTotal(Product pro) {
		return pro.getAmount() + calculateTax(pro) - calculateDiscount(pro);
	}

	@Override
	public String toString() {
		return "Invoice [p=" + p + ", Totalamount=" + Totalamount + "]";
	}

}