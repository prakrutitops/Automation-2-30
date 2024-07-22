package testng.examples;
import org.testng.annotations.Test;

public class Example2 
{
	
	@Test(priority = 1)
	public void C()
	{
		System.out.println("Test1 Called");
	}
	
	@Test(priority = 4)
	public void B()
	{
		System.out.println("Test2 Called");
	}
	
	@Test(priority = 2)
	public void A()
	{
		System.out.println("Test3 Called");
	}
	
	@Test(priority = 3)
	public void D()
	{
		System.out.println("Test4 Called");
	}
	
}
