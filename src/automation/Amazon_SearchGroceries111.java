package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchGroceries111 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement SearchField = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		SearchField.sendKeys("shoes");

	}

}
