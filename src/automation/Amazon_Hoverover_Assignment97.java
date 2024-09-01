package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hoverover_Assignment97 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(1500);
		WebElement w = driver.findElement(By.partialLinkText("Account & Lists"));
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
		
		WebElement signin = driver.findElement(By.partialLinkText("Sign in"));
		signin.click();
		
		
	}

}
