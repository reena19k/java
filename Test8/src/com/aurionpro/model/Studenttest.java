package com.aurionpro.model;

public class Studenttest {
	public static void main(String[] args) {
		Student[] students = { new Student(1, "reena", 2, 70, "mumbai"), new Student(4, "renu", 3, 80, "jhansi"), new Student(2, "kunal", 4, 81, "delhi"),
		 new Student(6, "anu", 3, 8, "jhansi")};
		
		Calculate s1 = new Calculate(students);
}
}
