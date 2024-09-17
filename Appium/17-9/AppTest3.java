package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppTest3 
{
	public static void main(String[] args) throws MalformedURLException,InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability("appPackage","com.androidsample.generalstore");
		
		cap.setCapability("appActivity","com.androidsample.generalstore.AllProductsActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);

//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Harsh");
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}
	
}