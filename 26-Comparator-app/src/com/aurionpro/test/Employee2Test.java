package com.aurionpro.test;
import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.Collections;

public class Employee2Test {
    public static void main(String[] args) {
        ArrayList<Employee2> list= new ArrayList<Employee2>();

        list.add(new Employee2(993,"reena",45000));
        list.add(new Employee2(145,"simran",65000));
        list.add(new Employee2(867,"ashish",35000));
        list.add(new Employee2(527,"immanuel",68000));
        list.add(new Employee2(635,"shivam",68000));
        System.out.println("Unsorted");

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list, new SortById());

        System.out.println("Sorted by Id");

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }


        Collections.sort(list, new SortByName());

        System.out.println("Sorted by Name");

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
