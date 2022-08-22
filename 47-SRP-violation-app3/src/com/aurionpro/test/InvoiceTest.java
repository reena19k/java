package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Invoice;
import com.aurionpro.model.Product;

public class InvoiceTest {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("101", "milk", 50, 10, 5));
		products.add(new Product("102", "tea", 100, 5, 10));
		products.add(new Product("103", "biscuit", 75, 3, 5));
		products.add(new Product("104", "oil", 150, 12, 10));
		products.add(new Product("105", "maggi", 250, 30, 5));
																				
		Invoice in = new Invoice(products);
		
		
	}

}