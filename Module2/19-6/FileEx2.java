package com.a196;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream - write
//FileInputStream - read

public class FileEx2 
{
	public static void main(String[] args) 
	{
		
		
		try 
		{
			FileInputStream fin = new FileInputStream("E://harsh.txt");
			int i =0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
			
		}
		
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally 
		{
			//System.out.println("File Read");
		}
		
	}
}
