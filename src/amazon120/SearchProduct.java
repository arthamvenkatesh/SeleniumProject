package amazon120;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchProduct {
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		System.out.println("search product");
		ChromeDriver driver = new ChromeDriver();
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
		
		Thread.sleep(2000);
		
		WebElement searchele = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchele.sendKeys("mobiles" +Keys.ENTER);
	}

}
