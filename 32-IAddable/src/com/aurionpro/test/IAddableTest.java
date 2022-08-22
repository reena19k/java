package com.aurionpro.test;

import com.aurionpro.model.IAddable;

public class IAddableTest {
	public static void main(String[] args) {
		IAddable obj = new IAddable() {

			@Override
			public int addIntegers(int a, int b) {
				int sum = a + b;
				return sum;
			}
		};
		System.out.println(obj.addIntegers(8, 4));

		IAddable obj2 = (f, j) -> {

			return f + j;
		};
		System.out.println(obj2.addIntegers(2, 4));
		
		IAddable obj3 = IAddableTest::addNumbers;
		System.out.println(obj3.addIntegers(3, 6));

	}
	
	public static int addNumbers(int x,int y) {
		return x+y;
	}
}