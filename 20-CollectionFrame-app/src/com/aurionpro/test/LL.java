package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Employee;

public class LL {

	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");

		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
		ll.set(1, "X");
		System.out.println(ll);
		for (String str : ll)
			System.out.print(str + " ");

	}
}