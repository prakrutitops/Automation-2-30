package com.a16;

public class StaticMethodEx 
{
	int id;
	String name;
	static String college="xyz";
	
	public StaticMethodEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	static void change()
	{
		college="abcd";
		
		//System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		change();
		
		StaticMethodEx s1 = new StaticMethodEx(101,"a");
		StaticMethodEx s2 = new StaticMethodEx(102,"b");
		StaticMethodEx s3 = new StaticMethodEx(103,"c");
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
