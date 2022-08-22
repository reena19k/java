package com.aurionpro.model;

public class Calculate {
	public Student[] s;
	public double totalmarks;

	public Calculate(Student[] s) {
		this.s = s;
		for(Student std:s) {
			this.totalmarks+=std.getMarks();
		}
		printDetails();
	}

	public double calculatePercentage(Student s) {
		return s.getMarks() / 100;

	}

	public boolean isPassorFail(Student s) {
		if (s.getMarks() >= 50) {
			return true;
		}
		return false;
	}

	public void allotDevision(Student s) {
		if (s.getMarks() > 80 && s.getMarks() <= 100) {
			System.out.println("student is in A division");
		} else if (s.getMarks() > 50 && s.getMarks() < 80) {
			System.out.println("students are in B division");
		}

		else {
			System.out.println("students are in c division");
		}

	}
	public void printDetails() {
		for(Student stds:s) {
		System.out.println("name of students" +stds.getName());
		System.out.println("marks of students " +stds.getMarks());
		System.out.println("calculate percentage " +calculatePercentage(stds));
		System.out.println("is studeent is pass or fail" +isPassorFail(stds) );
		allotDevision(stds);
		System.out.println("_____________---");
	}
		System.out.println("total marks is" +totalmarks);

}
}
