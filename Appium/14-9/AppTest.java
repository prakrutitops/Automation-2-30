package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppTest 
{
	public static void main(String[] args) throws MalformedURLException,InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability("appPackage","com.bak.mnr.calculatrice");
		
		cap.setCapability("appActivity","com.bak.mnr.calculatrice.MainActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);

		Thread.sleep(2000);
		
		driver.findElement(By.id("com.bak.mnr.calculatrice:id/btn8")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnP")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.bak.mnr.calculatrice:id/btn2")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnE")).click();
		
		Thread.sleep(2000);
	
		String ans = driver.findElement(By.id("com.bak.mnr.calculatrice:id/Cadre")).getText().toString();
		
		Thread.sleep(2000);
		
		if(ans.equals("10.0"))
		{
			System.out.println("correct");
		
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnC")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.bak.mnr.calculatrice:id/btn2")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnP")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.bak.mnr.calculatrice:id/btn1")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnE")).click();
		
		}
		else
		{
			System.out.println("incorrect");
		}
		
		
		
		
		
		//driver.quit();
	}
	
}