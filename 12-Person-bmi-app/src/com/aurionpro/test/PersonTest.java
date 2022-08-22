package com.aurionpro.test;

import com.aurionpro.model.Bmi;
import com.aurionpro.model.GenderOption;
import com.aurionpro.model.Person;

public class PersonTest {

	public static void main(String[] args) {

		Person sachin = new Person("Reena", 22, 124, 12,GenderOption.FEMALE);

		Bmi bmi = new Bmi(sachin);

		System.out.println(bmi.getPerson());
		System.out.println(bmi.calculateBMI());
		System.out.println(bmi.getBodyType());

	}

}