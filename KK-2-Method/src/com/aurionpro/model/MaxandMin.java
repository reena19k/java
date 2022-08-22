package com.aurionpro.model;

import java.util.Scanner;

public class MaxandMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("Enter your second number");
		int b = sc.nextInt();
		System.out.println("Enter your third number");
		int c = sc.nextInt();
		System.out.println("Enter a value to check if the no is prime or not");
		int n = sc.nextInt();
		maximum(a,b,c);
		minimum(a,b,c);
		evenOrodd(a);
		int result=product(a,b);
		System.out.println("product of two number is" +result);
		primeOrnot(n);
	}

	

	private static void primeOrnot(int n) {
		if(n<=1) {
			System.out.println("number is invalid");
	
		}for(int i=0;i<n;i++) {
		if(n%i==0) {
			System.out.println("number is prime");
		}else {
			
		}
			
		}
	}



	private static int product(int x, int y) {
		int result=x*y;
		return result ;
		
	}



	private static void evenOrodd(int a) {
		if(a%2==0) {
			System.out.println("num is even");
		}
		else{
		System.out.println("num is odd");
	}
	}



	private static void minimum(int first, int second, int third) {
		int min=first;
		if(min<second) {
			min=second;
		}
		if(second<third) {
			min=third;
		}
		System.out.println("max is " +min);
		}
	

	private static void maximum(int first, int second, int third) {
		int min=first;
		if(min>second) {
			min=second;
		}
		if(second>third) {
			min=third;
		}
		System.out.println("min is" +min);
		}
	}

