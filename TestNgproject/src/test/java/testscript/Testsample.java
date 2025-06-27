package testscript;

import org.testng.annotations.Test;

public class Testsample extends Base {
	@Test(priority=1)
	public void show()
	{
		System.out.println("Hi show");
	}
	@Test(priority=3)
	public void display()
	{
		System.out.println("Hello disp");
	}
	@Test(priority=2)
	public void read()
	{
		System.out.println("Hello read");
	}

}
