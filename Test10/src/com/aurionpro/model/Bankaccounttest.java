package com.aurionpro.model;

import java.util.ArrayList;

public class Bankaccounttest {
	public static void main(String[] args) {

		ArrayList<BankAccount> bka = new ArrayList<>();
		bka.add(new BankAccount("asd", 'c', 233346, 235, 34));
		bka.add(new BankAccount("shsk", 's', 24645, 245, 24));
		Calculate c = new Calculate(bka);
}
}
