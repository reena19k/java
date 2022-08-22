package com.aurionpro.test;

public class UpdateMarks {

	public static void main(String[] args) {
		int marks[] = { 50, 60, 70, 80 };
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		updateMarksToZero(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

	public static void updateMarksToZero(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}
	}
}
