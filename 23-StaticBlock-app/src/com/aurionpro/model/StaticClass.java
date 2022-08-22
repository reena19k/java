package com.aurionpro.model;

public class StaticClass {

	public StaticClass() {
		System.out.println("you are in parent constructor cls");
	}
	static {
		System.out.println("you are in parent static class");
	}
}