package com.aurionpro.test;

import com.aurionpro.model.Location;

import com.aurionpro.model.Students;

public class StudentsTest {
	public static void main(String[] args) {
		
	
	Students[] studentarray = {new Students(1, "reena", Location.delhi),new Students(2, "rahul", Location.pune),
			new Students(3, "anusuya", Location.mumbai),
			new Students(4, "kunal", Location.delhi),new Students(5, "madhavi", Location.mumbai)};

	Students result=(nameBelongtoRahul(studentarray));
	}

	private static Students nameBelongtoRahul(Students[] studentarray) {
		int count;
		Students st = new Students();
		for (Students s : studentarray) {
			if (s.getName() == "rahul") {
				count = s.getName();
				st = s;
			}
		}
		return st;

	}
	
		
	}

	



	
	

}
