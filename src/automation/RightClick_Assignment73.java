package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick_Assignment73 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		driver.findElement(By.name("userName")).sendKeys("abcde");
		driver.findElement(By.name("password")).sendKeys("abcdfe");
		driver.findElement(By.name("loginCaptchaValue")).sendKeys("bfhr");
		
		driver.close();

	}

}
