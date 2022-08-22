package com.aurionpro.test;

public class IncrementNumber {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("value of a " + a);

		incrementByOne(a);

		System.out.println("value of a  " + a);

	}

	public static void incrementByOne(int a)
	{

		a++;

		 System.out.println("value of a " + a);

	}
}
