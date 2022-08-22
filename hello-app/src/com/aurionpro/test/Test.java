package com.aurionpro.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] arr) {
		int sum=0,i;
		Scanner sc = new Scanner(System.in);
		int[] arr1= new int[100];
		for(int j=0;j<arr1.length;j++)
				{
					arr1[j]= sc.nextInt();
					System.out.println("enter elements");
				}
		for(int j=0;j<arr1.length;j++)
		{
			System.out.println(arr1[j]);
		}
		
}
}