package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9874521589");
		driver.findElement(By.id("pass")).sendKeys("9874521589");
		driver.findElement(By.id("loginbutton")).click();

	}

}
