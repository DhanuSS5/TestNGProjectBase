package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base {
	@Test
	public void javaScriptExecutor()
	{
		driver.navigate().to("https://www.amazon.in/");     
		JavascriptExecutor js=(JavascriptExecutor) driver;//REF VARIBLE CREATION
		//js.executeScript("window.scrollBy(0,150)","");//javascript x,y axis
		//js.executeScript("window.scrollBy(0,-100)","");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");//scroll from top to bottom
		//automatically calculate page height and scroll
	}
	@Test
	public void inputForm()
	{
	
				
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement inpform=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//inpform.sendKeys("Dhanasree");
		
		//js.executeScript("arguments[0].value='value';",webelementname);
		js.executeScript("arguments[0].value='Dhanasree';",inpform);
		//js.executeScript("arguments[0].click();", webelementname);
		
		WebElement showButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		//FluentWait
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))//check in each 5 seconds whether element load or not
				.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.elementToBeClickable(showButton));
		showButton.click();
		//js.executeScript("arguments[0].click();", webelementname);
		js.executeScript("arguments[0].click();", showButton);
		
		
	}
}
