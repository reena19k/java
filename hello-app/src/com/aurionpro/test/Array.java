package com.aurionpro.test;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenght of the array");
		int N= sc.nextInt();
		int temp=0;
		int [] arr = new int[N];
		for(int i = 0;i<N;i++)
		{
			System.out.println("enter the element");
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<N;i++)
		{
			temp=arr[i];
			arr[i]=arr[N];
			arr[N]=temp;
			arr[N]--;
		}
		for(int i = 0;i<N;i++)
		{
			System.out.println(arr[i]);		
}
}
}
