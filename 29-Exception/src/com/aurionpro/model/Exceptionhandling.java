package com.aurionpro.model;

public class Exceptionhandling {
	public static void main(String[] args) {
		int c = 0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a / b;
			System.out.println("printing after exception,inside try");
		} 
		
		
//		catch (ArithmeticException e) {
//		System.out.println("arithmetic format exception");
//	} catch (NumberFormatException e) {
//		System.out.println("number format exception");
//	}
//	 catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("arry index bound format exception");
//			}
//		catch(RuntimeException e)
//		{
//			System.out.println("exception handling");
//		}
		catch(Exception e)
	{
			System.out.println("excaption handling");
	}
			finally {
				System.out.println("haha");
			}
			
		System.out.println(c);
	}

}