package com.aurionpro.model;

public class Student {
	private int roll_num;
	private int marks;
	private String name;
	
	public Student(int roll_num, int marks, String name) {
		
		this.roll_num = roll_num;
		this.marks = marks;
		this.name = name;
	}
	public Student(int roll_num, int marks) {
		this(roll_num,marks,"reena");
	}
	public Student(int roll_num) {
		this(roll_num,200,"kunal");
	}
	public int getRoll_num() {
		return roll_num;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
	public Student Studentgreatestmarks(Student student2)
	{
		if(this.getMarks()>student2.getMarks())
				return this;
		else
			return student2;
					
					

		
	}
	@Override
	public String toString() {
		return "Student [roll_num=" + roll_num + ", marks=" + marks + ", name=" + name + "]";
	}
}
