package com.a216;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializeEx 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://anjali.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id+" "+s.name);
	}
}
