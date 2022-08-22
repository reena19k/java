package com.aurionpro.model;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		sum2();
		int result=sum1();
		System.out.println("the sum " +result);
		greet();
		int x=sum3(10,20);
		System.out.println("the sum3 is" +x);
		Scanner sc = new Scanner(System.in);
		String name=sc.toString();
		System.out.println("enter your name");
		String result1 = myGreet(name);
		System.out.println(result1);
		
	}

	private static String myGreet(String name) {
		String message="hello" +name;
		return message;
	}

	private static int sum3(int i, int j) {
		int sum;
		return sum=i+j;
		
	}

	private static int sum1() {
		int num1,num2,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		num1=sc.nextInt();
		System.out.println("enter second no");
		num2=sc.nextInt();
		sum=num1+num2;
		
		return sum ;
		
	}
	private static void sum2() {
		int num1,num2,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no");
		num1=sc.nextInt();
		System.out.println("enter second no");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println(sum);

}
	private static String greet() {
		String result="hello world";
		return result;
	}
}
