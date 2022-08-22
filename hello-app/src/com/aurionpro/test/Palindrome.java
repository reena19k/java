package com.aurionpro.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		
		int a = 0;
		Ispalindrome(a);
		
	}
		

	private static void Ispalindrome(int n) {
		int rev=0;
		int palindrome=0;
		int temp=n;
		while(n>0) {
			rev=n%10;
			palindrome=rev+palindrome*10;
			n=n/10;
		}
		if(temp==palindrome) {
				System.out.println("palindrome");
		}
		else {
			System.out.println("npt a palindrome");
	
		}
		

	}
		
	}
