package com.example;

import java.sql.Connection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.DriverConnction;

public class S002_FbSignup {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = DriverConnction.getconnection("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("tops");
		
		Thread.sleep(1000);
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("tech");
		
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("tech@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement confemail = driver.findElement(By.name("reg_email_confirmation__"));
		confemail.sendKeys("tech@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("12345678");
		
		Thread.sleep(1000);
		
		WebElement day =  driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("19");
		
		Thread.sleep(1000);
		
		WebElement month =  driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("3");
		
		Thread.sleep(1000);
		
		WebElement year =  driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(24);
		
		Thread.sleep(1000);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		Thread.sleep(1000);
		
		WebElement btn= driver.findElement(By.name("websubmit"));
		btn.click();
		
		//driver.quit();
		
		//driver.quit();
		
		//		
//		WebElement day =  driver.findElement(By.id("day"));
//		Select days = new Select(day);
//		days.selectByVisibleText("19");
//		
//		WebElement month =  driver.findElement(By.id("month"));
//		Select months = new Select(month);
//		months.selectByValue("3");
//		
//		WebElement year =  driver.findElement(By.id("year"));
//		Select years = new Select(year);
//		years.selectByIndex(3);
//		
//		
//		List<WebElement> gender = driver.findElements(By.name("sex"));
//		gender.get(1).click();
		
	}
}
