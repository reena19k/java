package com.aurionpro.test;

public class Immutable {

	public static void main(java.lang.String[] args) {
		String name = "Dinesh";

		System.out.println(name.hashCode());
		name = "Nitesh";
		System.out.println(name.hashCode());

		String name1 = new String("Nitesh");
		if (name == name1) {
			System.out.println("equal"); 
		}

		else {
			System.out.println("not equal");
		}

	}
		

	}


