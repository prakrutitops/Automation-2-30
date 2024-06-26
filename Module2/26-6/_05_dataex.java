import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_dataex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Driver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("mobile")).sendKeys("7016962719");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("7016962719");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[2]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}
}
