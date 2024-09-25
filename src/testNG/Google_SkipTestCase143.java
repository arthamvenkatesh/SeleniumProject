package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_SkipTestCase143 {
	
	WebDriver driver;
	WebElement search;
	
	@BeforeMethod
	public void setup(){
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	
	@Test (priority = 1)
	public void launchBrowser() {
		search = driver.findElement(By.name("qa"));
		search.sendKeys("Banglore");
	}
	
	@Test (priority = 2,dependsOnMethods="launchBrowser")
	public void searchinGoogle()
	{
		search = driver.findElement(By.name("q"));
		search.sendKeys("Hyderabad");
	}

}
