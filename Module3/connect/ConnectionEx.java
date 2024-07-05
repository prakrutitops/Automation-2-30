package com.connect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectionEx 
{
	public static  WebDriver getconnection(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
