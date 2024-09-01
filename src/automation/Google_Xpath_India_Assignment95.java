package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Xpath_India_Assignment95 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		
		WebElement a1 = driver.findElement(By.xpath("//textarea[@name='q']"));
		a1.sendKeys("india");

	}

}
