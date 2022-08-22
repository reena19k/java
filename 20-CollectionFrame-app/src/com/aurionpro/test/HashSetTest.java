package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.*;
import java.util.ArrayList;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<ArrayList> set = new HashSet<>();

        ArrayList<Employee> list1 = new ArrayList<Employee>();
        list1.add(new Employee(01, "john", 30000.00));
        list1.add(new Employee(02, "paul", 40000.00));

        ArrayList<Employee> list2= new ArrayList<Employee>();
        list2.add(new Employee(11, "ram", 70000.00));
        list2.add(new Employee(22, "shyam", 60000.00));

        set.add(list1);
        set.add(list2);
        
        System.out.println(set.size());
        set.remove(1);
     


    }
}
