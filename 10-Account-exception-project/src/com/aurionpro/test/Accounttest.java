package com.aurionpro.test;

import com.aurionpro.model.Account;

public class Accounttest {

	public static void main(String[] args) {

		Account acc = new Account(101, 1000, "ABC");
		try {
			acc.deposit(40000);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
}