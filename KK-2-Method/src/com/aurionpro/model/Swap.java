package com.aurionpro.model;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		swap(a, b);{
			int c=99;
			a=40;
			System.out.println("vale" +a);
			System.out.println(c);
		}
		}

	private static void swap(int x,int y) {
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		

	}

}
