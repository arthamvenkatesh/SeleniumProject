package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollAmazonVisible151 {
	
	WebDriver driver;
	
	@Test
	public void amazonLogin()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(18,4596)");
		
	}

}
