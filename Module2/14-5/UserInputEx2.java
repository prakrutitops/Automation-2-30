package com.a145;

import java.util.Scanner;

public class UserInputEx2 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		if(pass.equals("1234"))
		{
			System.out.println("Welcome "+fname);
		}
		else
		{
			System.out.println("Invalid Crdentials");
		}
	}
}
