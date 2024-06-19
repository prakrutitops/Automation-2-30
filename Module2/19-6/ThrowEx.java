package com.a196;

public class ThrowEx 
{
	
	static void validate(int age)
	{
			if(age<18)
			{
				throw new ArithmeticException("Not Valid age");
			}
			else
			{
				System.out.println("Welcome to vote");
			}
	}
	
	
	public static void main(String[] args)
	{
		
		validate(12);
		
	}
}
