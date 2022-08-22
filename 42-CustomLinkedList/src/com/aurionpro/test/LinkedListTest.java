package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.Iterator;
public class LinkedListTest {
    public static void main(String[] args) {
                LinkedList customLinkedList = new LinkedList();
                customLinkedList.add(5);
                customLinkedList.add(10);
                customLinkedList.add(15);
                customLinkedList.add(40);
                customLinkedList.add(12);
                customLinkedList.add(50);
                customLinkedList.insertAt(3,60);
                customLinkedList.remove(10);
                customLinkedList.deleteNodeAt(2);
                customLinkedList.display();

                Iterator<Integer> ll = customLinkedList.iterator();
                System.out.println("-----------");
                while(ll.hasNext()){
                    System.out.println(ll.next());
                }
            }
    }