package com.aurionpro.model;

import java.util.*;
import java.util.stream.*;

public class SortThem {
	public static void main(String[] args){
        String[] names = {"Jay","Nimesh","MArk","Mhesh","Ramesh"};
        List<String> nameList = Arrays.asList(names);
        nameList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        
        nameList.stream().filter(name->name.toLowerCase().contains("a"))
        .limit(3)
        .forEach(System.out::println);
      
    
    }
}