package com.aurionpro.test;
import com.aurionpro.model.*;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CustomerTest {
    public static void main(String[] args) {
        PriorityQueue<CustomerOrder> orders= new PriorityQueue<CustomerOrder>();
        CustomerOrder oc1 = new CustomerOrder(1,100,"john");
        CustomerOrder oc2 = new CustomerOrder(2,200,"jay");
        CustomerOrder oc3 = new CustomerOrder(3,300,"jitu");
        CustomerOrder oc4 = new CustomerOrder(4,400,"jeet");
        CustomerOrder oc5 = new CustomerOrder(5,500,"jean");

        orders.add(oc1);
        orders.add(oc2);
        orders.add(oc3);
        orders.add(oc4);
        orders.add(oc5);

      System.out.println("Size of the Queue is "+orders.size());
      System.out.println("Peek element of this queue is "+orders.peek());

System.out.println(orders);
        while (!orders.isEmpty()){
            System.out.println(orders.poll());
        }


        }

}