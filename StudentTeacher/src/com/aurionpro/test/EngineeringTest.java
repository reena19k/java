package com.aurionpro.test;

import com.aurionpro.model.Person;
import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class EngineeringTest {

	public static void main(String[] args) {
		Student student = new Student(101, "Kalyan", "25102002");
		System.out.println(student);
		System.out.println(student.getBranch());
		Professor prof = new Professor(102, "Mumbai", "23081999");
		System.out.println(prof.calculateSalary());
		System.out.println(prof);
	}

}