package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Streamtest {

	public static void main(String[] args) {
	/*	Stream<Integer> stream = Stream.of(10,20,30,40);
		stream.forEach(n->System.out.println(n));
		
		Stream<String> stream1 = Stream.of("aa","bb","cc");
		stream1.forEach(n->System.out.println(n));
		
		System.out.println(stream1);
		List<String> players=Arrays.asList("kumar","rohot");
		players.stream().forEach(n->System.out.println(n));
		
		Stream<String> obj=Stream.generate(
				()->"hello").limit(10);
		obj.forEach(n->System.out.println(n));
		
		List<Integer> list = Arrays.asList(10,20,20,20,23,34,45,66,76,77);
		List<Integer> squares=list.stream()
				.filter(n->n%2==0)
				.map(n->n*n)
				.collect(Collectors.toList());
		squares.parallelStream().forEach(System.out::println);
		
/*	for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.println(list.get(i));
			}
			
		}
	
	List<Integer> evenlist=list.stream()
		
		.filter(n->n%2==0)
		.distinct()
		.limit(5)
		.collect(Collectors.toList());	
	
		evenlist.stream().forEach(System.out::println);*/
		
		List<Integer> list1 = Arrays.asList(2,1,3,4,5,5,3,2);
		
		List<Integer> even =list1.stream().filter(n->n%2==0).distinct().limit(1).collect(Collectors.toList());
	System.out.println(even);
	String names[]= {"dd","rr","tt"};
	Stream<String> name2=Stream.of(names);
	
	
		
		
}
}

