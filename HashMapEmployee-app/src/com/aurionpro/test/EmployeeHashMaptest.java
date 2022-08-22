package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.aurionpro.model.Employee;

public class EmployeeHashMaptest {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(101, "aaa", "abc"), new Employee(101, "bbb", "lmn"),
				new Employee(101, "ccc", "pqr") };

		HashMap<Integer, Employee> empHash = new HashMap<Integer, Employee>();

		for (Employee emp : employees) {

			empHash.put(emp.getId(), emp);

		}

		Set<Map.Entry<Integer, Employee>> values1 = empHash.entrySet();

		for (Map.Entry<Integer, Employee> entries : values1) {

			System.out.println(entries.getKey() + " :-" + entries.getValue());

		}

	}

}