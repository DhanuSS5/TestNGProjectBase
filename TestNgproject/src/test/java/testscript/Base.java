package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		//String pageSource=driver.getPageSource();
		driver.manage().window().maximize();
	}
	//@AfterMethod
	public void QuitAndClose()
	{
		driver.close();
	}
	

}
