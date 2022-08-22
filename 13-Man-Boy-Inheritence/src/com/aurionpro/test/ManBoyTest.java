package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		case1();
		case2();
		case3();
	//	case4();
		case5();
		case6();
		


}

	private static void case6() {
		Object obj;
		obj=10;
		System.out.println(obj.getClass());
		obj="reena";
				System.out.println(obj.getClass());
				obj=10<20;
				System.out.println(obj.getClass());
		
	}

	private static void case5() {
		isAtPark(new Man());
		isAtPark(new Kid());
		isAtPark(new Infant());
		isAtPark(new Boy());
		
	}

private static void isAtPark(Man man) {
	man.play();
	man.read();
	}

/*	private static void case4() {
		Boy boy = new Man();
		boy.read();
		boy.play();
		
	} */

	private static void case3() {
		Man man = new Boy();
		man.read();
		man.play();
		
		
	}

	private static void case2() {
		Boy boy = new Boy();
		boy.read();
		boy.play();
		Kid kid = new Kid();
		kid.play();
		kid.read();
		
	}

	private static void case1() {
		Man man = new Man();
		man.read();
		man.play();
				
		
		
	}
}

