package com.aurionpro.test;

import java.util.Scanner;

public class Prime01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		int i,count=1;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count>2)
	{
		System.out.println("prime num is not a" +n);
	}
	else
	{
		System.out.println("prime num is"+n);
	}
	}
	
}


