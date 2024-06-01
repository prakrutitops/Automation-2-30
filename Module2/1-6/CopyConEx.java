package com.a16;

public class CopyConEx 
{
	int id;
	String name;
	
	 CopyConEx(int id,String name) 
	{
		
		this.id = id;
		this.name = name;
		
	}
	 CopyConEx(CopyConEx c1) 
		{
			
			System.out.println(c1.id+" "+c1.name);
			
		}
	
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		CopyConEx c1 = new CopyConEx(101,"abcd");
		CopyConEx c2 = new CopyConEx(c1);
	
		c1.display();
		//p2.display();
	}
	
}
