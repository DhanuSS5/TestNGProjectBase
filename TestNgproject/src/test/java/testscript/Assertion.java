package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEquatTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);//for copy from console
		String expectedstring="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring, expectedstring);
		//for situation which is not same
		//assertNotEquals
		//String expectedstring1="most Reliable App & Cross Browser Testing Platform | BrowserStack";
		//Assert.assertNotEquals(actualstring, expectedstring1);
		
	}
	@Test
	public void notEqualTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);//for copy from console
		String expectedstring1="most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring, expectedstring1);
	}
	@Test
	public void assertTrueTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle=driver.getTitle().equalsIgnoreCase("most Reliable App & Cross Browser Testing Platform | BrowserStack");
		//check only content same or not in equalignorecase,if equal return true go to verifytitle 
		Assert.assertTrue(verifytitle);
		//assertNotequal
		//boolean verifytitle1=driver.getTitle().equalsIgnoreCase("mostReliable App & Cross Browser Testing Platform | BrowserStack");
		//Assert.assertFalse(verifytitle1);
		
	}
	@Test
	public void assertFalseTest()
	{

		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle1=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(verifytitle1);
		//both must not be same
	}

}
