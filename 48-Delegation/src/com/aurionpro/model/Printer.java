package com.aurionpro.model;


public class Printer {

	DelegatePrinter dprint = new DelegatePrinter();

	public void print() {

		dprint.prints();
	}

}