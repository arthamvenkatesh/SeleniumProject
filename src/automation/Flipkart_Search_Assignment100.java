package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Search_Assignment100 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		e.sendKeys("shoe");
		
		Thread.sleep(1500);
		
		List<WebElement> t = driver.findElements(By.xpath("//form[@class=\"_2rslOn header-form-search OpXDaO\"]/ul/li"));
		System.out.println(t.size());
		
		t.get(t.size()-6).click();

	}

}
