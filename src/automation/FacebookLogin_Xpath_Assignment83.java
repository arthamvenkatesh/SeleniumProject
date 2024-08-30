package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//FacebookLogin by using Xpath#
public class FacebookLogin_Xpath_Assignment83 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("abcd@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("asdf");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();

	}

}
