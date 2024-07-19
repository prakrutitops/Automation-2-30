package com.unit;

import org.junit.Test;

public class Rundata 
{
	@Test
	public void run()
	{
		Addition a = new Addition();
		System.out.println(a.sum(6, 5));
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void run2()
	{
		Arithmatic a = new Arithmatic();
		a.divide(6,0);
		
	}
}
