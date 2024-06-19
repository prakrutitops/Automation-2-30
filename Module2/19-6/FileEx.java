package com.a196;

import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream - write
//FileInputStream - read

public class FileEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		String s= "welcome to tops";
	
		FileOutputStream fout = new FileOutputStream("E://harsh.txt");
		fout.write(s.getBytes());
		
		
		
		
		
		
	}
}
