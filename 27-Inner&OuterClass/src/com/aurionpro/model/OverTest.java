package com.aurionpro.model;
import java.util.*;
class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int calculateArea(){
        return length*length;
    }

    public int calculatePerimeter(){
        return length+breadth;
    }


}

public class OverTest {
    public static void main(String[] args) {

        Rectangle r2 = new Rectangle(3,5);

        System.out.println("Perimeter of rectangle is "+r2.calculatePerimeter());
        System.out.println("Area of rectangle is "+r2.calculateArea());


        System.out.println("here we are going to override methods by using annonymous class");
        Rectangle r = new Rectangle(3,5){   //anonymous class
            
            public int calculateArea() {
                return length*breadth;
            }

            
            public int calculatePerimeter() {
                return 2*(length+breadth);
            }
        };

        System.out.println("Perimeter of rectangle is "+r.calculatePerimeter());
        System.out.println("Area of rectangle is "+r.calculateArea());



    }
}