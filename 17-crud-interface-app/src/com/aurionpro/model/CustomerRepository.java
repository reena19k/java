package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("customer is creating");

	}

	@Override
	public void update() {
		System.out.println("customer is updating");

	}

	@Override
	public void delete() {
		System.out.println("customer is deleting");

	}

	@Override
	public void read() {
		System.out.println("customer is reading");

	}

}
