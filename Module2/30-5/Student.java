package com.a305;

public class Student 
{
	//data members	
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		//object creation
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//assign value
		s1.id=101;
		s1.name="harsh";
		
		s2.id=102;
		s2.name="anjali";
		
		s3.id=103;
		s3.name="ajay";
		
		//print value
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		System.out.println(s3.id+" "+s3.name);
		
		
		
		
	}
	
}
