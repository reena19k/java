package com.aurionpro.test;
class Cat{
	String Name;
	int age;
	String Color;
	String Bread;
	void Sleep() {
		System.out.println("cat is sleepy");
	}
	void play() {
		System.out.println("cat is playing");
	}
	void  breed()	{
		System.out.println("cat is of bread");
	}
};
public class Pattern {

	public static void main(String[] args) {
		
		Cat tom = new Cat();
		Cat persey = new Cat();
		tom.breed();
	}

}

