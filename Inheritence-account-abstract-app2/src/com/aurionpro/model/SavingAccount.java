package com.aurionpro.model;

public class  SavingAccount extends Account {

	private static final int Min_Balance = 5000;

	public SavingAccount(int id, double balance, String name) {
		super(id, balance, name);

	}

	@Override
	public void withdraw(double ammount) {

		if (this.getBalance() - ammount < Min_Balance) {
			System.out.println("Insufficient bal");
		} else {
			this.setBalance(this.getBalance() - ammount);
		}
	}

}