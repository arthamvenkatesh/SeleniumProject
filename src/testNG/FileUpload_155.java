package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload_155 {
	
	WebDriver driver;
	
	@Test
	public void fileUpload()
	{
		driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement fileupload =driver.findElement(By.id("file"));
		fileupload.sendKeys("C:\\Users\\venkat\\Downloads\\a.pdf");
		
	}

}
