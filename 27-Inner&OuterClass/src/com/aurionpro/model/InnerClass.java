package com.aurionpro.model;
class Outer{
	int a=10;
	public void show()
	{
		System.out.println("you are in outer class");
	}
	class Inner{
		int b=20;
		public void display()
		{
			System.out.println("you are in inner class" +b);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}

}
