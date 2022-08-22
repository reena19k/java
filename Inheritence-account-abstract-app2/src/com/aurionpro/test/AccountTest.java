package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {

		SavingAccount saving = new SavingAccount(101, 1000, "REENA");
		saving.withdraw(10000);
		printAccountDetails(saving);
		saving.deposit(30000);
		printAccountDetails(saving);
		CurrentAccount current = new CurrentAccount(102, 100, "SHUBHAM");
		current.withdraw(50000);
		printAccountDetails(current);

	}

	private static void printAccountDetails(Account saving) {
		System.out.println("acc_no =" + saving.getId());
		System.out.println("acc_holder_name =" + saving.getName());
		System.out.println("acc_balance =" + saving.getBalance());
	}

}