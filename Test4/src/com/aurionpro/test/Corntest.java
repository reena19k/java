package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Corn;

public class Corntest {

	public static void main(String[] args) {
		Corn[] crn = { new Corn(1, "a", 1298, 120), new Corn(2, "b", 12356, 450), new Corn(3, "c", 23542, 100),
				new Corn(4, "d", 3533, 500) };
		System.out.println(findAvgofProtein(crn));
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your code");
			int cd = sc.nextInt();
			Corn c = searchByCornId(crn, cd);
			if (c != null) {
				System.out.println(c);
			} else {
				System.out.println("NOt found");

			}
		}

	}

	private static Corn searchByCornId(Corn[] crn, int cd) {
		for (Corn c : crn) {
			if (c.getId() == cd)
				return c;
		}
		return null;

	}

	private static double findAvgofProtein(Corn[] crn) {
		double avg = 0;
		for (Corn c : crn) {
			avg = avg + c.getProtein();
		}
		return avg / crn.length;

	}
}
