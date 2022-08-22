package com.aurionpro.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadUsingStream {
	public static void main(String[] args) {
		String fileName="C:\\Swabhav techlab repositary\\core\\39-Task2-app\\lib\\bin";
		try {
			Stream<String>stream = Files.lines(Paths.get(fileName));
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
