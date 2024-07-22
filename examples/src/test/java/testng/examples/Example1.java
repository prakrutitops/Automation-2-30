package testng.examples;
import org.testng.annotations.Test;

public class Example1 
{
	
	@Test
	public void C()
	{
		System.out.println("Test1 Called");
	}
	
	@Test
	public void B()
	{
		System.out.println("Test2 Called");
	}
	
	@Test
	public void A()
	{
		System.out.println("Test3 Called");
	}
	
	@Test
	public void D()
	{
		System.out.println("Test4 Called");
	}
	
}
