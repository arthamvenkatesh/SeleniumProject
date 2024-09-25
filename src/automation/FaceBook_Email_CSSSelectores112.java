package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Email_CSSSelectores112 {
	
		public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		email.sendKeys("abcd@gmail.com");

	}

}
