package com.aurionpro.model;

public class Accountant extends Pen {

	public Accountant(int id) {
		super(id);
		
	}
	@Override
	public void write() {
		System.out.println("pen is writing through accountant");
	}
	@Override
	public void refill() {
		System.out.println("pen if refill through accountant");
	}
	public void print(Pen pen) {
		System.out.println("id of pen is" +pen.getId());
	}


}
