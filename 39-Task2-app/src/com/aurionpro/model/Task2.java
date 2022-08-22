package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException  {
		File file = new File("C:\\Swabhav techlab repositary\\core\\39-Task2-app\\lib\\bin");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			while((line=br.readLine())!=null) {
				sb.append(line);
				sb.append("\n");
			}
			fr.close();
			System.out.println("Contents of file:");
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

