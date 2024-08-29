package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Signin_Assignment74 {

	public static void main(String[] args) throws InterruptedException {
		// //a[@aria-label="Sign in"]
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.xpath("//a[@aria-label=\"Sign in\"]"));
		signin.click();	

	}

}
