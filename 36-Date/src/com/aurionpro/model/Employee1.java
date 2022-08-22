package com.aurionpro.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee1 {
	public int id;
	public String name;
	public double salary;
	public Date doj;
	
	DateFormat date = new SimpleDateFormat("dd-MM-yyyy");

	public Employee1(int id, String name, double salary, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		try {
			this.doj = date.parse(doj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
