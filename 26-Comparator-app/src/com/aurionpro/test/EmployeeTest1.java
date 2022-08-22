package com.aurionpro.test;
import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest1 {
    public static void main(String[] args) {
        ArrayList<Employee> list= new ArrayList<Employee>();

        list.add(new Employee(993,"reena",45000));
        list.add(new Employee(145,"kunal",65000));
        list.add(new Employee(867,"simran",35000));
        list.add(new Employee(527,"aditi",68000));

        System.out.println("Unsorted");

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);

        System.out.println("Sorted");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
