package com.aurionpro.model;

public class Account {

	private int id;

	private double balance;
	private String name;

	public Account(int id, double balance, String name) {

		this.id = id;
		this.balance = balance;

		this.name = name;
	}

	public void deposit(double ammount) {

		if (ammount > balance) {

			throw new InsufficientFundsException("insufficient ammount in the account");
		}
		else {
			balance-=ammount;
		}

	}

	public void withdraw(double ammount) {

		
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}

	

}