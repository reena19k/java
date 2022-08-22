package com.aurionpro.model;

public class ProductRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Produc is creating");

	}

	@Override
	public void update() {
		System.out.println("Product is updating");

	}

	@Override
	public void delete() {
		System.out.println("Product is deleting");

	}

	@Override
	public void read() {
		System.out.println("Product is reading");

	}

}
