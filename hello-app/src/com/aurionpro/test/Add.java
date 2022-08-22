package com.aurionpro.test;

import java.util.Scanner;

public class Add {
	int a,b;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		a=sc.nextInt();
		System.out.println("Enter your second number");
		b=sc.nextInt();
		
	}
	void putdata()
	{
		System.out.println("addition is"+(a+b));
	}

	public static void main(String[] args) {
		Add aa = new Add();
		aa.getdata();
		aa.putdata();
				

	}

}
