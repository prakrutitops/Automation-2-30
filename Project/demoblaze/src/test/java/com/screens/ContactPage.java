package com.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactPage 
{
	@Test
	public void contactcheck()
	{
		HomePage.driver.findElement(By.id("recipient-email")).sendKeys("a@gmail.com");
		HomePage.driver.findElement(By.id("recipient-name")).sendKeys("admin");
		HomePage.driver.findElement(By.id("message-text")).sendKeys("test");
		
	}
}
