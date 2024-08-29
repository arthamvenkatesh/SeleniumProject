package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Assignment68 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("email")).sendKeys("9874521589");
		driver.findElement(By.id("pass")).sendKeys("9874521589");
		driver.findElement(By.id("loginbutton")).click();*/
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("abcd");
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("abcd");
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();

	}

}
