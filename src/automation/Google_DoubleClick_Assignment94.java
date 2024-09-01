package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_DoubleClick_Assignment94 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement w = driver.findElement(By.linkText("Gmail"));
		Actions a = new Actions(driver);
		a.doubleClick(w).perform();

	}

}
