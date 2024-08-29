package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechForm_Validation_Assignment70 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Artham");
		driver.findElement(By.id("lastName")).sendKeys("Venkatesh");
		driver.findElement(By.id("email")).sendKeys("artham@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("12354566");
		driver.findElement(By.id("aadhaar")).sendKeys("123-456-879");
		driver.findElement(By.id("pan")).sendKeys("POLE7891");
		
		WebElement ele = driver.findElement(By.id("terms"));
		if(ele.isSelected()) {
			System.out.println("selected");
		}else
		{
			ele.click();
		}

	}

}
