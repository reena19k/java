package com.aurionpro.model;

public class Printer {
	DelegatePrinter pri = new DelegatePrinter();
	public void print() {
		pri.print();
	}

}
