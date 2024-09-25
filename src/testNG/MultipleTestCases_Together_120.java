package testNG;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTestCases_Together_120 {
	
	WebDriver driver;
	Actions act;
	
	@BeforeMethod
	public void setUP()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		act = new Actions(driver);
		WebElement list = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(list).perform();
		
		WebElement Signin = driver.findElement(By.xpath("//span[text()=\"Sign in\"][1]"));
		Signin.click();
	}
	
	@Test (priority = 1)
	public void loginAamzon() throws IOException
	{
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("9573217406");
		
		WebElement conbutton = driver.findElement(By.cssSelector("#continue"));
		conbutton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Venkatesh@123");
		
		WebElement loginbutton = driver.findElement(By.id("signInSubmit"));
		loginbutton.click();
		
		WebElement searchfield = driver.findElement(By.cssSelector("input[id^=\"two\"]"));
		searchfield.sendKeys("shoes");
		

	}
	
	@Test (priority = 2)
	public void searchProduct() throws InterruptedException
	{
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("9573217406");
		
		WebElement conbutton = driver.findElement(By.cssSelector("#continue"));
		conbutton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Venkatesh@123");
		
		WebElement loginbutton = driver.findElement(By.id("signInSubmit"));
		loginbutton.click();
		
		Thread.sleep(2000);
		WebElement searchele = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchele.sendKeys("mobiles" +Keys.ENTER);
		
	}
	
	@AfterMethod
	public void close() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java By MKT\\ScreenShots\\ss"+ Math.random()+".png");
		org.openqa.selenium.io.FileHandler.copy(source,dest);
		
		driver.close();
	}

}
