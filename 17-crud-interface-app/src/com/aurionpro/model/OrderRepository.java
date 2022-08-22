package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("order is creating");

	}

	@Override
	public void update() {
		System.out.println("order is updating");

	}

	@Override
	public void delete() {
		System.out.println("order is deleting");

	}

	@Override
	public void read() {
		System.out.println("order is reading");

	}

}
