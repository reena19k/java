package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class EmployeeTestSerialize {
 public static void main(String[] args) {
	try {
		Employee employee = new Employee(101, "reena", 10000); 
			FileOutputStream file = new FileOutputStream("test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			 
			out.writeObject(employee);
			out.close();
			file.close();
			System.out.println("object serialize");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
	}
	
}
}
