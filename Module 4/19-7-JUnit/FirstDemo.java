package com.unit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FirstDemo 
{
	@Test
	public void anjali()
	{
		System.out.println("test1 called");
	}
	
	@Test
	public void anjali2()
	{
		System.out.println("test2 called");
		fail();
	}
	
}
