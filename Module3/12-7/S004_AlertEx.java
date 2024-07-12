package com.example;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.util.DriverConnction;

public class S004_AlertEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(2000);
//		alert.accept();
//	
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele  =driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		
		
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();

		
//		driver.findElement(By.id("promtButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Typing1234..");
//		alert.dismiss();
		
		
		
		
	}
}
