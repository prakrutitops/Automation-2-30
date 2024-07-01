package com.a17;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector<>(5);
		
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("d");
		v.addElement("d");
		v.addElement("c");
		v.addElement("d");
		v.addElement("d");
		v.addElement("d");
		v.addElement("d");
		
		
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		
		
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
