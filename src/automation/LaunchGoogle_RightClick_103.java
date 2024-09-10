package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchGoogle_RightClick_103 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		Actions a = new Actions(driver);
		a.contextClick(gmailLink).perform();
	}

}
