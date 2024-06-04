package com.a46;

interface A
{
	void a();//abstract method
}
interface B
{
	void b();
}
class C implements A,B
{

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}
	
}

public class MultipleEx 
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.a();
		c.b();
	}
}
