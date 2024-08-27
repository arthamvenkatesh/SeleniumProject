// Browser launch - type INDIA and search in Google
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_Search {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("India" + Keys.ENTER);
	}

}
