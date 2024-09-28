package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GrotechMinds_AlertHandle154 {
	
	WebDriver driver;
	
	@Test
	public void groTechAlertHandle()
	{
		driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		WebElement buttonclick = driver.findElement(By.xpath("//button[text()=\"Click \"]"));
		buttonclick.click();
		
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(1000));
		w1.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
	}

}
