package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchProduct_Addcart_Assignement80 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		
		WebElement e = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		e.click();
		e.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		e.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		e.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		e.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		e.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		e.sendKeys(Keys.DOWN);
		e.click();
		
		Thread.sleep(2000);
		
		////input[@type="text"]
		////div[@data-csa-c-id="v51zbb-dly89i-twem5n-x04ek"]
		WebElement searchbox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		searchbox.sendKeys("dolo" +Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement tablets = driver.findElement(By.xpath("//button[@id=\"a-autoid-1-announce\"]"));
		tablets.click();
		
		

	}

}
