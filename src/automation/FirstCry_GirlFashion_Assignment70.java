package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry_GirlFashion_Assignment70 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		
		WebElement w= driver.findElement(By.partialLinkText("GIRL FASHION"));
		w.click();
	}

}
