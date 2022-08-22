package com.aurionpro.test;
import java.io.*;
import java.util.*;

class HahsSet {

	public static void main(String args[]) {
		HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(3, 0.5f);

		hm1.put(1, "Hello");
		hm1.put(2, "in");
		hm1.put(3, "java");

		hm2.put(4, "in");
		hm2.put(5, "hash");
		hm2.put(6, "map");

		System.out.println("Mappings of HashMap hm1 are : " + hm1);
		hm1.put(2, "on");
		System.out.println("Mappings of HashMap hm1 are : " + hm1);
		System.out.println("_______________");
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		hm2.remove(4);
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		
	}
}
