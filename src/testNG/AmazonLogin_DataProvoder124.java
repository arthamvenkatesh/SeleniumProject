package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLogin_DataProvoder124 {
	
	
	@Test (dataProvider="amazonlogin")
	public void amazon_login(String uname, String pword)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement list = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(list).perform();
		
		WebElement Signin = driver.findElement(By.xpath("//span[text()=\"Sign in\"][1]"));
		Signin.click();
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(uname);
		
		WebElement conbutton = driver.findElement(By.cssSelector("#continue"));
		conbutton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pword);
		
		WebElement loginbutton = driver.findElement(By.id("signInSubmit"));
		loginbutton.click(); 
	}
	
	@DataProvider(name="amazonlogin")
	public Object[][] logindata ()
	{

		Object[][] d1 = new Object[2][2]; 
		
		//1stCredentials
		d1[0][0] = "9573217406";
		d1[0][1] = "Venkatesh@123";
		
		//2nd rown
		d1[1][0] = "2222222222";
		d1[1][1] = "abcdef@gmail.com";
		return d1;
				
	}

}
