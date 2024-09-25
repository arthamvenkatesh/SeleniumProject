package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailedTestcases_IRetryAnalyzer126 {

	@Test (retryAnalyzer=testNG.RetryAnalizer.class)
	public void googleSearch1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Banglore");
	}
	
	@Test(retryAnalyzer=testNG.RetryAnalizer.class)
	public void googleSearch2()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("m"));
		search.sendKeys("Hyderbad");
	}

}
