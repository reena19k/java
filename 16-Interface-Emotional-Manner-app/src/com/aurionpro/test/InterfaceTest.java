package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotional;
import com.aurionpro.model.Imannarable;
import com.aurionpro.model.Man;

public class InterfaceTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		atTheMovie(man);
		atTheParty(boy);
		//atTheMovie(boy);
		
	}

	private static void atTheMovie(IEmotional person) {
		person.cry();
		person.laugh();
		
	}

	private static void atTheParty(Imannarable person) {
		person.depart();
		person.great();
	}

}
