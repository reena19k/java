package com.aurionpro.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThread {  
	  
    public static void main(String[] args) {  
        ExecutorService executorService = Executors.newSingleThreadExecutor();  
        executorService.execute(new Runnable() {  
              
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
        });  
        executorService.shutdown();  
    }  
}   