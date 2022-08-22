package com.aurionpro.model;

public class BankAccount {

	private String holderName;
	private char type;
	private long accountnumber;
	private int balance;
	private int age;

	public BankAccount(String holderName, char type, long accountnumber, int balance, int age) {
		super();
		this.holderName = holderName;
		this.type = type;
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.age = age;
	}

	public String getHolderName() {
		return holderName;
	}

	public char getType() {
		return type;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "BankAccount [holderName=" + holderName + ", type=" + type + ", accountnumber=" + accountnumber
				+ ", balance=" + balance + ", age=" + age + "]";
	}

}
