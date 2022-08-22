package com.aurionpro.model;

public class StaticClass2 extends StaticClass{

	public StaticClass2() {
		super();
		System.out.println("you are in child constructor class");
	}
	static {
		System.out.println("you are in child static class");
	}
}