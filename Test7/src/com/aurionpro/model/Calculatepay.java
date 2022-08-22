package com.aurionpro.model;

public class Calculatepay {
	private Employee emp;
	char band;
	int i;
	public Calculatepay(Employee emp,char band) {
		this.emp=emp;
		this.band=band;
	}

	public double calculatePay1() {
		double salary=0;
		if(band=='A') {
			salary=8000;
		}
		else {
			salary=7000;
		}
		return salary;
	}

	
	
	
}
