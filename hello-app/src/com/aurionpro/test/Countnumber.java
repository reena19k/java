package com.aurionpro.test;

import java.util.Scanner;

public class Countnumber {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int result=0,rev;
		while(num>0)
		{
		rev=num%10;
		result=rev+(result*10);
		num=num/10;
		}
		System.out.println(result);
	}
}


