package com.aurionpro.test;

import java.util.*;

class PQ{
	
	public static void main(String args[])
	{
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		System.out.println(pQueue.peek());

		System.out.println(pQueue.poll());
		pQueue.add(30);
		
		System.out.println(pQueue);
		
		pQueue.poll();
		System.out.println(pQueue);
		
		
		
	}
}
