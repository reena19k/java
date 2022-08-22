package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		
		ArrayList<LineItem> items = new ArrayList<>();
		items.add(new LineItem(1,"marie",3,50));
		items.add(new LineItem(2,"parleg",2,25));
		items.add(new LineItem(3,"rice",5,70));
		items.add(new LineItem(4,"dal",4,30));
		items.add(new LineItem(5,"oil",1,90));
		
		double totalCartPrice = 0;
		for(LineItem item:items)
			totalCartPrice +=item.getTotalCost();
		
		System.out.println("Total cart price: "+totalCartPrice);
	}

}