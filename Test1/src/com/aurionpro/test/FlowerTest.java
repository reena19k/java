package com.aurionpro.test;


import com.aurionpro.model.Flower;

public class FlowerTest {

	public static void main(String[] args) {
		Flower[] obj = { new Flower(1, 'a', 2, 55), new Flower(2, 'b', 3, 40), new Flower(3, 'c', 22, 20),
				new Flower(4, 'd', 1, 10) };


	

		Flower result = price(obj);
		System.out.println(result);
	}
	
	public static Flower price(Flower[] obj) {
		int maxprice=0;
		Flower highprice = new Flower();
		for (Flower f : obj) {
			if(f.getPrice()>maxprice);
				maxprice = f.getPrice();
				highprice =f;
			
		}
		
		
		return highprice;
		
	}
	

	
}
	
	
		
	


