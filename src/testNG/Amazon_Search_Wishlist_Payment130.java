package testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Search_Wishlist_Payment130 {
	
	WebDriver driver;
	
	@Test
	public void amazonLogin() throws InterruptedException
	{
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
		
		Thread.sleep(1500);
		
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("shoe" +Keys.ENTER);
		
		WebElement selectproduct = driver.findElement(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"][1]"));
		selectproduct.click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> handles = windows.iterator();
		
		String parentwindow = handles.next();
		String childwindow = handles.next();
		
		driver.switchTo().window(childwindow);
		
		WebElement addcartbutton = driver.findElement(By.xpath("//input[@name=\"submit.add-to-cart\"]"));
		addcartbutton.click();
		
		WebElement proceedtobuy = driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]"));
		proceedtobuy.click();
		
		Assert.assertEquals("Select a delivery address", "Select a delivery address");
		
		System.out.println(driver.getTitle());
		
		

	}

}
