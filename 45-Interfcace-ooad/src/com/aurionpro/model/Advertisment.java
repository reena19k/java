package com.aurionpro.model;

public class Advertisment {
	IDiplayable disp;
	

	public void setDisp(IDiplayable disp) {
		this.disp = disp;
	}


	public void showAdvertisemnt() {
		disp.display();
	}

}
