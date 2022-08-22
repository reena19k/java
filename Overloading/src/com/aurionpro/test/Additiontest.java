package com.aurionpro.test;

import com.aurionpro.model.Addition;

public class Additiontest {

	public static void main(String[] args) {
		Addition obj = new Addition();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10.5, 20.5));
		System.out.println(obj.add(10, 20,30));
		System.out.println(obj.add(10, 20,30.5));

	}

}
