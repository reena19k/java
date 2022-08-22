package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class EmployeeTestDeserialize {
 public static void main(String[] args) {
	try {
		Employee employee = null;
			FileInputStream file = new FileInputStream("./lib/test.bin");
			ObjectInputStream in = new ObjectInputStream(file);
			 employee = (Employee)
			in.readObject();
			in.close();
			file.close();
			
			System.out.println("object deserialize");
			System.out.println(employee);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
