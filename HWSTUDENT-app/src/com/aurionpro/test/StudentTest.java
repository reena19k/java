package com.aurionpro.test;
import com.aurionpro.model.*;

public class StudentTest {
	 public static void main(String[] args) {
		 Student student1 =  new Student(22, 600);
		 Student student2 =  new Student(26, 7, "ishika");
		 Student greatestmarks= student1.Studentgreatestmarks(student2);
		 System.out.println(greatestmarks);
	 }
	 
	 
}
