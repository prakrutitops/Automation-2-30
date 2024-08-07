package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.DriverConnction;


public class S014_screenshot {

	public static void getScreenShot(WebDriver driver, String imgname) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\img\\"+imgname+".png");

		try 
		{
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/automation-practice-form");
		getScreenShot(driver, "err");
	}
}
