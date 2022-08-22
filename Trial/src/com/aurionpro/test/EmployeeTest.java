package com.aurionpro.test;

import com.aurionpro.model.IEmployee;

public class EmployeeTest {

	public static void main(String[] args) {
		IEmployee obj = new IEmployee() {

			@Override
			public void run() {
				System.out.println("employee is running");
			}
			

		};
		obj.run();
		IEmployee obj2 = ()->{
			System.out.println("im in lamda class");
		};
		obj.run();
		IEmployee obj3 =  EmployeeTest::showMessage;{
		}
		obj.run();

	}
	public static void showMessage() {
		System.out.println("im in runnable class");
	}
}
