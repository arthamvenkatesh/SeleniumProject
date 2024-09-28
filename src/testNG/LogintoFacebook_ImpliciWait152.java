package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogintoFacebook_ImpliciWait152 {
	
	WebDriver driver;
	
	@Test
	public void loginFb()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
		
		WebElement username_textfield = driver.findElement(By.cssSelector("#email"));
		username_textfield.sendKeys("9573217406");
		WebElement password_textfied = driver.findElement(By.cssSelector("#pass"));
		password_textfied.sendKeys("Venkatesh@123");
		WebElement singin_button = driver.findElement(By.cssSelector("#loginbutton"));
		singin_button.click();
	}

}
