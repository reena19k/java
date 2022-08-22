package com.aurionpro.model;

public class Student { 
	int roll;
	String name;
	static long pop; 
	Student(int roll1,String naam){
		this.name=naam;
		this.roll=roll1;
		Student.pop+=1;
	}

	

	public static void main(String[] args) {
		Student student1=new Student(12,"reena");
		System.out.println(student1);
		Student student2=new Student(23,"kunal");
		System.out.println(student1.pop);
		System.out.println(student2.pop);
		System.out.println(student1.pop);
		mi();
	}
	 static void mi() {
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
}
