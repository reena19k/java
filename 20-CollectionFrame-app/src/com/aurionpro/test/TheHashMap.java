package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;

public class TheHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("rohit", 10);
		map.put("kumar", 30);
		map.put("ram", 20);
		map.put("Vijay",101);
		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		map.remove(2);
			System.out.println("Mappings after removal are : " + map);
		map.put("shyam", 2);
		System.out.println("Mappings after removal are : " + map);
		
	}
}
