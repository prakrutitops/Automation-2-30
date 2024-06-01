package com.a16;

public class StaticBlockEx 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
	}
	//it will run always before main method
	static
	{
		System.out.println("Hello");
	}
	
}
