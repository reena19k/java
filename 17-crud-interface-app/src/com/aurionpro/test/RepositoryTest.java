package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		IRepository customer = new CustomerRepository();
	   repositaryCrud(customer);
	   IRepository order = new OrderRepository();
	   repositaryCrud(order);
	   IRepository product = new ProductRepository();	
	   repositaryCrud(product);
	}

	private static void repositaryCrud(IRepository repository) {
		repository.create();
		repository.delete();
		repository.read();
		repository.update();
		System.out.println("-------------");
	}
}

