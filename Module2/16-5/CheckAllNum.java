package com.a165;

import java.util.Scanner;

public class CheckAllNum 
{
	static int lastdigit=0;
	
	public static void main(String[] args) 
	{
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		
		
		while (num > 0)
		{
			lastdigit = lastdigit+num%10;//lastdigit+=num%10
			num=num/10;
		}
		System.out.print("Sum of all digit is : "+lastdigit);
	}
}
