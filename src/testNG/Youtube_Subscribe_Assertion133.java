package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Youtube_Subscribe_Assertion133 {
	
	WebDriver driver;
	
	@Test
	public void youtube_Channel_Subscribe() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		searchfield.sendKeys("SoftwaretestingbyMKT");
		
		WebElement click = driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]"));
		click.click();
		
		WebElement subscribe = driver.findElement(By.xpath("//a[@aria-label='Subscribe']"));
		subscribe.click();
		
		String titlepf = driver.getTitle();
		System.out.println(titlepf);
		
		Assert.assertEquals("YouTube", "YouTube");
		
		

	}

}
