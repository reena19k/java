package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.LineItemSet;

public class LineItemSetTest {

	public static void main(String[] args) {
		Set<LineItemSet> items = new HashSet<LineItemSet>();
		items.add(new LineItemSet(1,"parle-g",6,5));
		items.add(new LineItemSet(1,"parle-g",9,10));
		items.add(new LineItemSet(4,"oil",6,150));
		items.add(new LineItemSet(2,"rice",50,700));
		items.add(new LineItemSet(3,"dal",9,350));
		items.add(new LineItemSet(4,"mango",5,3000));
		
		for(LineItemSet item:items)
			System.out.println(item);

	}

}