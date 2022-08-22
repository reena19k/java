package com.aurionpro.test;


import com.aurionpro.model.IExectuable;

public class ExecuteTest {

	public static void main(String[] args) {
		Executable obj = new Executable();
		obj.execute();
		IExectuable ex = ExecuteTest::showMessage;
		ex.execute();
		
		IExectuable ex1 = new IExectuable() {

			@Override
			public void execute() {
				System.out.println("executing inside anonymous class");
			}
			
		};
		ex1.execute();
	
	
		IExectuable ex11 = ()->{
		System.out.println("Executing lambda");
	};
	ex11.execute();
}
	public static void showMessage() {
		System.out.println("show msg called ");
	}
}
