package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Fileupload extends Base {
	@Test
	public void fileUploadUsingSendKeys()
	{
		//ExplicitWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
	WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
	upload.sendKeys("C:\\Users\\user\\Downloads\\User Story - Rainbow[1] (1).pdf");
	WebElement fileupload=driver.findElement(By.xpath("//input[@id='file-submit']"));
	wait.until(ExpectedConditions.elementToBeClickable(fileupload));//ExpectedConditions is a class//wait until element is load
	fileupload.click();
	}
	@Test
	public void fileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload1=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		upload1.click();
		//uploaded path
		StringSelection stringselection=new StringSelection("C:\\Users\\user\\Downloads\\User Story - Rainbow[1] (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);//toolkit is a class methods in the class
		//string selection object ciontain pdf path.//file explorer cannot direct interact ,copy to clipboard and upload
		Robot robot=new Robot();
		robot.delay(2500);//for delay
		robot.keyPress(KeyEvent.VK_CONTROL);//copy in 31,it paste using keyboard events ctl+v//uppercases are constant
		robot.keyPress(KeyEvent.VK_V);//VK-VIRTUAL KEY ctl+v(for paste)
		robot.keyRelease(KeyEvent.VK_CONTROL);//key release control
		robot.keyRelease(KeyEvent.VK_V);//release v
		robot.keyPress(KeyEvent.VK_ENTER);//for file upload
		robot.keyRelease(KeyEvent.VK_ENTER);//key release 
		
		
	}

}
