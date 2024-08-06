package com.screens;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.util.MyConnection;

public class HomePage 
{
	static WebDriver driver;
	
	@Test
	public void a1homepageopen() throws InterruptedException
	{
		 driver = MyConnection.getconnection("https://www.demoblaze.com/");
		Thread.sleep(1000);
		
	}
	@Test
	public void a2logocheck() throws InterruptedException
	{
	
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();
		
	}
	@Test
	public void a3headeroptionsclick() throws InterruptedException
	{
		
		System.out.println("\n Enter 1 For Home Page");
		System.out.println("\n Enter 2 For Contact Page");
		System.out.println("\n Enter 3 For About Page");
		System.out.println("\n Enter 4 For Cart Page");
		System.out.println("\n Enter 5 For Login Page");
		System.out.println("\n Enter 6 For Signup Page");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num)
		{
		
			case 1:
				driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
			break;	
			
			case 2:
				driver.findElement(By.linkText("Contact")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.id("recipient-email")).sendKeys("a@gmail.com");
				driver.findElement(By.id("recipient-name")).sendKeys("admin");
				driver.findElement(By.id("message-text")).sendKeys("test");
				driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
				//driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")).click();
			break;	
				
			case 3:
				driver.findElement(By.linkText("About us")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
			break;	
				
			case 4:
				break;	
				
			case 5:
				break;	
				
			case 6:
				break;	
		
		}
		

	}
}
