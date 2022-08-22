package com.aurionpro.model;

import java.util.Scanner;

public class Bustest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 Bus[] buses = {new Bus(1, 23, "red", "kalyan"),new Bus(2, 20, "yellow", "pune"),new Bus(3, 70, "green", "delhi")};
		 System.out.println("hello");
		System.out.println(findBuswithMaximmunseat(buses));
		System.out.println("enter your city");
		 String city = sc.next();
		 
		Bus b1=searchBusbyCity(buses,city);
		if(b1==null) {
			System.out.println("no bus available");
		}else {
			System.out.println(b1);
		}
	}

	private static Bus searchBusbyCity(Bus[] buses, String city) {
		for(Bus b:buses) {
			if(b.getCity().equals(city)) {
				return b;
			}
		}
		return null;
	}

	private static Bus findBuswithMaximmunseat(Bus[] buses) {
		int max=0;
		Bus newBus = new Bus();
		for(Bus b:buses) {
			if(b.getSeatt()>max) {
			max=b.getSeatt();
			newBus=b;
			}
				
		}
		return newBus ;
		
		
	}


}
