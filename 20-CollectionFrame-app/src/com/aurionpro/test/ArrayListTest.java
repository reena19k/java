package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(01, "john", 30000.00));
		list.add(new Employee(02, "paul", 40000.00));
		list.add(new Employee(03, "robert", 50000.00));
	
		list.set(2, new Employee(04, "johnny", 60000.00));
		list.remove(1);
		printValues(list);

	}

	public static void printValues(ArrayList<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			Employee data = list.get(i);
			System.out.println(data.id + " " + data.name + " " + data.salary);
		}
	}
}
