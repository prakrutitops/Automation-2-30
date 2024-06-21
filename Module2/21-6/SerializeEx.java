package com.a216;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args) throws IOException 
	{
		Student s1 = new Student(101,"harsh");
		FileOutputStream fout = new FileOutputStream("E://anjali.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		System.out.println("success");
	}
}
