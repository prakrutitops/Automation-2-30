package com.a16;

class Bank
{
	void bank()
	{
		System.out.println("Banking");
	}
}
class Current extends Bank
{
	void current()
	{
		System.out.println("current");
	}
}
class Save extends Bank
{
	void save()
	{
		System.out.println("saving");
	}
}

public class HierarchicalEx 
{
	public static void main(String[] args) 
	{
		Current c = new Current();
		Save s = new Save();
		
		c.current();
		s.save();
		c.bank();
	}
}
