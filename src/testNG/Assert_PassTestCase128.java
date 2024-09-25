package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_PassTestCase128 {
	
	WebDriver driver;
	
	@Test
	public void assertPass()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertEquals("Gmail", "Gmail");
	}

}
