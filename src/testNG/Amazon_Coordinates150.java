package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Coordinates150 {
	
	WebDriver driver;
	
	@Test
	public void amazonLogin()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		
		WebElement aboutusamazonlink = driver.findElement(By.xpath("//a[text()=\"About Amazon\"]"));
		Point o = aboutusamazonlink.getLocation();
		int x = o.getX();
		int y = o.getY();
		System.out.println(x);
		System.out.println(y);
		
	}

}
