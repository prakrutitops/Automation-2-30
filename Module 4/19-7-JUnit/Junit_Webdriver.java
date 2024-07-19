package com.unit;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Webdriver 
{
	WebDriver driver=null;
	
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Driver\\chromedriver.exe");
		driver=new ChromeDriver(); // to open the browser as a blank
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	
	@Test
	public void login() throws InterruptedException
	{
	
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("Your Login Test hasbeen passed...");
		}
		else
		{
			System.out.println("Your Login Test hasbeen Failed...");
			fail();
		}
	}
	
	
	@After
	public void after() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);;
		driver.close();
	}
}
