package com.aurionpro.test;
import java.util.*;
import com.aurionpro.model.*;
public class ArrayDequeueTest {
    public static void main(String[] args) {
        Deque<Employee> deque = new ArrayDeque<Employee>(10);

        deque.add(new Employee(01, "john", 30000.00));
        deque.add(new Employee(02, "paul", 40000.00));
        deque.add(new Employee(03, "robert", 50000.00));


        for (Employee element : deque) {
            // Print the corresponding element
            System.out.println("Element : " + element.toString());
        }


    }
}
