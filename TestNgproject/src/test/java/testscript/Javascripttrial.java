package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Javascripttrial extends Base{
@Test
	public void javaScriptExecuter()
	{
		//driver.navigate().to("https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver; //REF VARIBLE CREATION
		//js.executeScript("window.scrollBy(0,350)", "");
		//js.executeScript("window.scrollBy(0,-550)", "");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
	}
@Test
    public void inputForm()
    {
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement textfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	//textfield.sendKeys("krishna");
    	//js.executeScript("arguments[0].value='value';",webelementname);
    	js.executeScript("arguments[0].value='krishna';",textfield);
    	WebElement showbutton=driver.findElement(By.xpath("//button[@id='button-one']"));
    	//showbutton.click();
    	//js.executeScript("arguments[0].click();", webelementname);
    	js.executeScript("arguments[0].click();", showbutton); //javascript
    }

}