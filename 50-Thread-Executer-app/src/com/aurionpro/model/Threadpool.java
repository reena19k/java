package com.aurionpro.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadpool {

	public static void main(String[] args) {
		ExecutorService executerservice = Executors.newFixedThreadPool(3);
		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task 1 start");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("task1 stop");
			}
			
		};
		Runnable task2 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task 2 start");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("task2 stop");
			}
			
		};
		Runnable task3 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task 3 start");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("task3 stop");
			}
			
		};
		executerservice.submit(task1);
		executerservice.submit(task2);
		executerservice.submit(task3);
		executerservice.shutdown();
	}

}
