package com.aurionpro.model;

import java.util.*;

public class Count {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(20, 30, 40, 60, 30, 50, 40, 40, 30, 20, 20));
		HashMap<Integer, Integer> m1 = new HashMap<>();
		int count = 0;
		int i,j;
		for (i = 0; i < obj.size(); i++) {
			for (j = 0; j < obj.size(); j++) {
				if (obj.get(i) == obj.get(j))
					count++;
			}
			m1.put(obj.get(i), count);
			count = 0;
		}

		System.out.println(m1);
	}

}