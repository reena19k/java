package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.*;
public class StackTest {
    public static void main(String[] args) {
        Stack<Employee> stack = new Stack<Employee>();

        stack.push(new Employee(01, "john", 30000.00));
        stack.push(new Employee(21, "rude", 50000.00));
        stack.push(new Employee(24, "remmy", 6000.00));

        System.out.println(stack.peek());

        for (Employee element : stack) {
            // Print the corresponding element
            System.out.println("Element : " + element.toString());
        }



    }
}
