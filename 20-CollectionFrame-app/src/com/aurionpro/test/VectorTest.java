package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.*;
public class VectorTest {
    public static void main(String[] args) {
        Vector<Employee> v = new Vector<Employee>();

        v.add(new Employee(01, "john", 30000.00));
        v.add(new Employee(12, "julie", 50000.00));
        v.add(new Employee(14, "kim", 40000.00));
        v.remove(2);
        printValues(v);
    }
    public static void printValues(Vector<Employee> v)
    {
        for (int i = 0; i < v.size(); i++) {
            Employee data = v.get(i);
            System.out.println(data.id + " " + data.name + " " + data.salary);
        }
    }
}
