package com.aurionpro.model;

import java.util.ArrayList;

public class Calculate {
	public ArrayList<BankAccount> bka;

	public Calculate(ArrayList<BankAccount> bka) {
		super();
		this.bka = bka;
		printDetails();
	}

	public void printDetails() {
		for(BankAccount bk:bka) {
		System.out.println("saving" +calculateSavings(bk));
		calculateLife(bk);
		determineType(bk);
		System.out.println("-----------");
	}
	}

	public double calculateSavings(BankAccount bk) {
		return bk.getBalance();
	}

	public void determineType(BankAccount bk) {
		if (bk.getType() == 's') {
			System.out.println("saving");
		} else {
			System.out.println("current");
		}
	}

	public void calculateLife(BankAccount bk) {
		if (bk.getAge() <= 60) {
			System.out.println("account is expired");
		} else if (bk.getAge() > 50 && bk.getAge() < 60) {
			System.out.println("10nyear are remaining");
		} else {
			System.out.println("account is ok");
		}

	}

}
