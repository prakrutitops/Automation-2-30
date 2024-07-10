package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.util.DriverConnction;

public class S003_PracticeForm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = DriverConnction.getconnection("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js  =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("drashti");
		
		Thread.sleep(1000);
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("xyz");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("d@gmail.com");
	
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		gender.click();
		
		Thread.sleep(1000);
		
		WebElement mob = driver.findElement(By.id("userNumber"));
		mob.sendKeys("998899889");
		
		Thread.sleep(1000);
		
		String day = "27";
		String month = "March";
		String year = "2000";
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		
		Thread.sleep(1000);
		
		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select y = new Select(myyear);
		y.selectByVisibleText(year);
		
		Thread.sleep(1000);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d : days)
		{
			if(d.getText().equals(day))
			{
				if(d.getAttribute("aria-label").contains(month))
				{
					d.click();
					break;
				}
				
			}
		}
		
		
		Thread.sleep(1000);
		
		
		WebElement hobby = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobby.click();
		
		Thread.sleep(1000);
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
	
		Thread.sleep(1000);
		
		WebElement addr = driver.findElement(By.id("currentAddress"));
		addr.sendKeys("Rajkot");
		
		Thread.sleep(1000);
		
		WebElement btnclick = driver.findElement(By.id("submit"));
		btnclick.click();
		Thread.sleep(1000);
		S014_screenshot.getScreenShot(driver, "practice-form");
		Thread.sleep(1000);
		driver.quit();
	}
}
