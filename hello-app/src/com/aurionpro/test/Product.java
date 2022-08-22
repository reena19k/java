package com.aurionpro.test;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter any number");
	int a=sc.nextInt();
	switch(a)
	{
	case 1:
	System.out.println("monday");
	break;
		case 2:
		System.out.println("teusday");
		break;
		case 3:
			System.out.println("wednesday");
	break;
		case 4:	
		System.out.println("thursday");
	break;
	default:
		System.out.println("fri");
		break;
}
}
}

