import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _03TopsCarrerEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Driver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("mobile")).sendKeys("6353641306");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("6353641306");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		
		Thread.sleep(1000);
		
		
		
		System.setProperty("webdriver.edge.driver", "E:\\software\\Driver\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://careercenter.tops-int.com/");
		
		driver2.manage().window().maximize();
		driver2.findElement(By.id("mobile")).sendKeys("9313012143");
		Thread.sleep(1000);
		driver2.findElement(By.id("password")).sendKeys("9313012143");
		Thread.sleep(1000);
		driver2.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		
	}
}
