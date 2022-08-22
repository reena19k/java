package com.aurionpro.model;

import java.util.*;
public class StackDeque {
	private static Deque<Integer> stack = new ArrayDeque<Integer>();
	
	public static void main(String[] args) {
		push(111);
		push(222);
		push(555);
		push(666);
		System.out.println(stack);
		pop();
		
		System.out.println(stack);
		pop();
		pop();
		pop();
		System.out.println(stack);
	}

	private static void pop() {
		stack.removeFirst();
	}

	private static void push(int number) {
		stack.addFirst(number);
	}
}