//Facebook- Create Account Button by Xpath
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CreateButton_Assignment84 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createbutton = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		createbutton.click();
	}
}
