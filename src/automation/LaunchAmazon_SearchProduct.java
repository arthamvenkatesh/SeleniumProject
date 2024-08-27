package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_SearchProduct {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.Amazon.in");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes" + Keys.ENTER);

	}

}
