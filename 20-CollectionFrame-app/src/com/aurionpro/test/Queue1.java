package com.aurionpro.test;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");

		System.out.println("The front element is " + queue.peek());
		System.out.println("The element of queue is" + queue);
		queue.remove();
		System.out.println("The element of queue is" + queue);
		queue.remove();
		System.out.println("The element of queue is" + queue);
		
		System.out.println("The front element is " + queue.peek());

		System.out.println("The queue size is " + queue.size());

		if (queue.isEmpty()) {
			System.out.println("The queue is empty");
		} else {
			System.out.println("The queue is not empty");
		}
	}
}
