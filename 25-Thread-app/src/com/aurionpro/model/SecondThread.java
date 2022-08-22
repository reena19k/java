package com.aurionpro.model;
import java.util.*;
public class SecondThread implements Runnable{

    @Override
    public void run() {
        System.out.println("This is a thread using runnable ");
        for(int i = 65;i<68;i++){
            System.out.print((char)i+" ");
        }
    }

    public static void main(String[] args) {
        SecondThread t2 = new SecondThread();
        Thread thread1 = new Thread(t2);
        thread1.start();
        
    }
}
//runnable does not support thread method thats why we create obj of thread class nd pass obj of runnable into its constructor