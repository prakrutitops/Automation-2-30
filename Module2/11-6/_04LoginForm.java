import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04LoginForm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Driver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}
}
