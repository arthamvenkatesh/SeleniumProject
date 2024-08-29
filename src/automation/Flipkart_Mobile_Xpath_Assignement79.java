package automation;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Mobile_Xpath_Assignement79 {

	public static void main(String[] args) {
		// 
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		WebElement searhbox  = driver.findElement(By.xpath("//input[@name='q']"));
		searhbox.sendKeys("mobiles", Keys.ENTER);
		

	}

}
