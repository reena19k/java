package com.aurionpro.test;
import java.util.*;
public class Greatestno
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter first no:");
		int b = sc.nextInt();
		System.out.println("enter second no:");
		if(a>b)
		{
		System.out.println(a+"is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}
	}
}

