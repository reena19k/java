package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Product;

public class Producttest {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList2 = productsList.stream()
				.filter(p -> p.price > 30000)
				.map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(productPriceList2);
		
		productsList.stream()
		.filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));
		
		double totalPrice3 = productsList.stream()
				.collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);
		
		Product productA = productsList.stream()
				.max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productA.price);

		Product productB = productsList.stream()
				.min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productB.price);
	

		long count = productsList.stream()  
                .filter(product->product.price<30000)  
                .count();  
    System.out.println(count);  
    Map<Object, Object> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap);  
	}

}
