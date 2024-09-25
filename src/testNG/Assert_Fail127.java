package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Fail127 {
	
	@Test
	public void AmazonLoad()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String s = driver.getTitle();
		System.out.println(s);
		Assert.assertEquals("Google", "gmail");
	}

}
