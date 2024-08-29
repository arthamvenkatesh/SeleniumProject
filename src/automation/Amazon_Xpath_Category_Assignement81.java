package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath_Category_Assignement81 {

	public static void main(String[] args) {
		// //span[text()="All"]
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		
		WebElement e = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		e.click();
		e.sendKeys(Keys.DOWN);
		e.sendKeys(Keys.DOWN);
		e.sendKeys(Keys.DOWN);
		e.sendKeys(Keys.DOWN);

	}

}
