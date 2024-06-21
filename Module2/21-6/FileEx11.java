package com.a216;

import java.io.File;
import java.io.IOException;

public class FileEx11 
{
	public static void main(String[] args) throws IOException 
	{
		String s = "welcome";
		File f = new File("E://abc.txt");
		f.createNewFile();
		
		System.out.println(f.exists());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.lastModified());
		
	}
}
