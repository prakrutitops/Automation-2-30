package com.a145;

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");

		}
		
	}
}
