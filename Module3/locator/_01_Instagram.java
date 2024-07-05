package com.locator;

import java.sql.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.connect.ConnectionEx;

public class _01_Instagram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = ConnectionEx.getconnection("https://www.instagram.com/");
		
	
	WebElement uname = driver.findElement(By.name("username"));
	uname.sendKeys("tops7890");

	
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("123456");
	
	WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
	btn.click();
	
	Thread.sleep(3000);
	
	WebElement txt1 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/span/div"));
	String data = txt1.getText();
	System.out.println(data);
	
	if(data.equals("Sorry, your password was incorrect. Please double-check your password."))
	{
		//System.out.println("success");
		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/div/div/button"));
		btn2.click();
	}
	else
	{
		System.out.println("Futher proceed");
	}
	

	
	
	}
}
