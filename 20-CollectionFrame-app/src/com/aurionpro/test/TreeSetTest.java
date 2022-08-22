package com.aurionpro.test;
import java.util.*;
import com.aurionpro.model.*;
public class TreeSetTest {
    public static void main(String[] args) {
    	  Set<String> ts1 = new TreeSet<>();
    	  ts1.add("reena");
          ts1.add("A");
          ts1.add("B");
          ts1.add("C");
          ts1.add("hello");
          ts1.add("C");
          System.out.println("Initial TreeSet " + ts1);
          ts1.remove("B");
          System.out.println("After removing element " + ts1);
          ((TreeSet<String>) ts1).pollFirst();
          System.out.println("After removing first " + ts1);
          ((TreeSet<String>) ts1).pollLast();
          System.out.println("After removing last " + ts1);

          System.out.println(ts1);
      }

}
