package com.a216;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx1 
{
	//FileOutputStream - write
	//FileInputStream - read
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		String s = "Welcome to tops";
		FileOutputStream fout = new FileOutputStream("E://xyz.txt");
		fout.write(s.getBytes());
		System.out.println("success");
		
		Thread.sleep(1000);
		
		FileInputStream fin = new FileInputStream("E://xyz2.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
	}
}
