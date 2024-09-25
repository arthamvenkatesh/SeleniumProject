package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Logout_Assertion131 {
	
	WebDriver driver;
	
	@Test
	public void amzon_Login() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement list = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(list).perform();
		
		WebElement Signin = driver.findElement(By.xpath("//span[text()=\"Sign in\"][1]"));
		Signin.click();
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("9573217406");
		
		WebElement conbutton = driver.findElement(By.cssSelector("#continue"));
		conbutton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Venkatesh@123");
		
		WebElement loginbutton = driver.findElement(By.id("signInSubmit"));
		loginbutton.click(); 
		
		WebElement lo = driver.findElement(By.xpath("//span[text()=\"Hello, Artham\"]"));
		act.moveToElement(lo).perform();
		
		WebElement signout = driver.findElement(By.xpath("//span[text()=\"Sign Out\"]"));
		signout.click();
		
		Assert.assertEquals("Amazon Sign In", "Amazon Sign In");
		
		//System.out.println(driver.getTitle());
	}

}
