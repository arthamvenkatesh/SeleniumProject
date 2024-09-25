package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Searh_GrotechMinds115 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.cssSelector("textarea.gLFyf[name=\"q\"]"));
		search.sendKeys("GroTechMinds");

	}

}
