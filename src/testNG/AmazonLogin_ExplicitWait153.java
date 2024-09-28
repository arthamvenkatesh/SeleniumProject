package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonLogin_ExplicitWait153 {
	
	WebDriver driver;
	
	@Test
	public void amzonLogin()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(1500));
		w1.until(ExpectedConditions.titleContains("Mobiles"));
		
		Actions act = new Actions(driver);
		WebElement list = w1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"))));
		act.moveToElement(list).perform();
		
		WebElement e = w1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()=\"Sign in\"][1]"))));
		e.click();
		
		w1.until(ExpectedConditions.titleContains("Amazon Sign In"));
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("9573217406");
		
		WebElement conbutton = w1.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#continue"))));
		conbutton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Venkatesh@123");
		
		WebElement loginbutton = w1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("signInSubmit"))));
		loginbutton.click();

	}

}
