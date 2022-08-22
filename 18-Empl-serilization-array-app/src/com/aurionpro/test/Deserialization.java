package com.aurionpro.test;

import java.io.EOFException;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class Deserialization {

	public static void main(String[] args) {
		Employee[] employees=null;


		try {
			FileInputStream file = new FileInputStream("./lib/test.bin");
			try {
				ObjectInputStream in = new ObjectInputStream(file);
				try {
				employees =	(Employee[]) in.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				in.close();
				file.close();
				System.out.println("Employee Object Deserialized\n");
				for (Employee r : employees) {
					System.out.println(r);
					System.out.println("-----------------------------");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
