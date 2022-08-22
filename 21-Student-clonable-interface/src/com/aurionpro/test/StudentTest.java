package com.aurionpro.test;

import com.aurionpro.model.*;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student();

		student.setStdId(108);
		student.setStdName("john");
		student.setDivision('A');

		Student copyOfStudent = (Student) student.clone(); // typecasting
		System.out.println("details of copystudent");
		System.out.println(copyOfStudent.getStdId());
		System.out.println(copyOfStudent.getStdName());
		System.out.println(copyOfStudent.getDivision());
		System.out.println("------------");
		System.out.println("details of student");
		System.out.println(student.getStdId());
		System.out.println(student.getStdName());
		System.out.println(student.getDivision());
	}
}