package com.a216;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw = new FileWriter("E://tops.txt");
		fw.write("hfjsdfhds");
		fw.close();
		
		FileReader fr = new FileReader("E://tops.txt");
		int i=0;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
