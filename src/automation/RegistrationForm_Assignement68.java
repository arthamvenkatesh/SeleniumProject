package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm_Assignement68 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("venkatesh");
		driver.findElement(By.id("lname")).sendKeys("artham");
		driver.findElement(By.id("email")).sendKeys("venk@gmail.com");
		driver.findElement(By.id("password")).sendKeys("venkatesh");
		driver.findElement(By.id("Pincode")).sendKeys("520365");
		driver.findElement(By.id("male")).click();
		WebElement e = driver.findElement(By.id("relocate"));
		if(e.isSelected()) {
			System.out.println("already selected");
		}else {
			e.click();
		}
		

	}

}
