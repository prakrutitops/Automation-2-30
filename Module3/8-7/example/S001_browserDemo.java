package com.example;

import java.sql.Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.util.DriverConnction;

public class S001_browserDemo {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConnction.getconnection("https://www.facebook.com");
	}
}
