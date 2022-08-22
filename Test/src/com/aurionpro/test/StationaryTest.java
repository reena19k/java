package com.aurionpro.test;

import com.aurionpro.model.Stationary;

public class StationaryTest {

	public static void main(String[] args) {
		Stationary[] statinaries = { new Stationary("reena", 33, "nike", true),
				new Stationary("kunal", 70, "adidas", false), new Stationary("ashish", 80, "nike", true),
				new Stationary("anusuya", 40, "bata", false), new Stationary("mohini", 10, "chalu", false) };
		Stationary result = (itemwithSmallestPrice(statinaries));
		System.out.println(result);
		Stationary result1 = (itemBelongtoNike(statinaries));
		System.out.println(result1);

	}

	private static Stationary itemBelongtoNike(Stationary[] statinaries) {
		int count;
		Stationary st = new Stationary();
		for (Stationary s : statinaries) {
			if (s.getBrand() == "nike") {
				count = s.getPrice();
				st = s;
			}
		}
		return st;

	}

	private static Stationary itemwithSmallestPrice(Stationary[] statinaries) {
		int min = 999;
		Stationary st = new Stationary();
		for (Stationary s : statinaries) {
			if (s.getPrice() < min) {
				min = s.getPrice();
				st = s;
			}
		}
		return st;
	}

}
