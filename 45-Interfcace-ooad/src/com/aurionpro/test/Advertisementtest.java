package com.aurionpro.test;

import com.aurionpro.model.Advertisment;
import com.aurionpro.model.IDiplayable;
import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class Advertisementtest {

	public static void main(String[] args) {
		Advertisment obj = new Advertisment();
		IDiplayable monitor = new Monitor();
		obj.setDisp(monitor);
		IDiplayable tv= new Television();
		obj.setDisp(tv);
		Projector pj = new Projector();
		pj.display();
	}

}
