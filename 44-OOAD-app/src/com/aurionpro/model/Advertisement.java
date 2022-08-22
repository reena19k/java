package com.aurionpro.model;

public class Advertisement {
	IDisplayable disp;

	public void setDisp(IDisplayable disp) {
		this.disp = disp;
	}
	public void showAdv() {
		disp.display();
	}

}
