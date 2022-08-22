package com.aurionpro.model;

import java.util.*;

public class FirstThread extends Thread {
	@Override
	public void run() // override
	{

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Thread started running..");
		System.out.println("running thread priority is " + Thread.currentThread().getPriority()); // currentthread
																									// pririty

	}

	public static void main(String args[]) {

		FirstThread t1 = new FirstThread();
		FirstThread t2 = new FirstThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}