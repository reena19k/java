package com.aurionpro.test;

import com.aurionpro.model.*;

import java.io.*;
import java.util.ArrayList;

public class FileReadingTest {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream readData = new FileInputStream("C:\\Swabhav techlab repositary\\core\\EXAM2\\src\\Country");
			ObjectInputStream readStream = new ObjectInputStream(readData);

			ArrayList countries = (ArrayList<Countries>) readStream.readObject();
			readStream.close();
			System.out.println(countries.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}