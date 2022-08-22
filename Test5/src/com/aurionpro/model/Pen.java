package com.aurionpro.model;

public abstract class Pen {
	private int id;

	public Pen(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	 
	public abstract void write();
	public abstract void refill();
	 
}
