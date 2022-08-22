package com.aurionpro.model;

public class StackTreeTest {

	public static void main(String[] args) {

		method1();
		System.out.println("End of main...");

	}

	private static void method1() {
		method2();
		System.out.println("End of method1");

	}

	private static void method2() {
		method3();
		System.out.println("End of method2");

	}

	private static void method3() {
		throw new RuntimeException("Error in method 3");
		// System.out.println("End of method3");

	}

}