package com.a165;

import java.util.Scanner;

public class CheckBigNum 
{
	static int temp;
	static int maxnum=0;
	
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		
		if(num>0)
		{
			while(num>0)
			{
				temp = num%10;
				if(temp>maxnum)
				{
					maxnum=temp;
				}
				num=num/10;
		
		}
			System.out.println(maxnum);
		}
		else
		{
			System.out.println("Please Enter Positive Number");
		}
		
	}
}
