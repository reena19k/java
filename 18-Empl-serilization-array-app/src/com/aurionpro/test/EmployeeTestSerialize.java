package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class EmployeeTestSerialize {
	public static void main(String[] args) {
		try {
			Employee[] employee = { new Employee(101, "reena", 10000), new Employee(102, "shivam", 20000),
					new Employee(103, "ashish", 40000), new Employee(104, "shubham", 50000) };

			FileOutputStream file = new FileOutputStream("./lib/test.bin");		//file is stored in h.d
			ObjectOutputStream out = new ObjectOutputStream(file);			//encoding all obj in byte code

			out.writeObject(employee);		//obj details write 
			out.close();		
			file.close();
			System.out.println("object serialize");
		} catch (FileNotFoundException e) {
			e.printStackTrace();  //print detail error
		} catch (IOException e) {
			e.printStackTrace();		//input output error
		}

	}
}
