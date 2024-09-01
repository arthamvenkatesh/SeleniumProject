package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechRegistration1_PerformDropdown_Assignement88 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		
		WebElement gendersel = driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		Select s1 = new Select(gendersel);
		s1.selectByValue("male");
		
		Thread.sleep(1500);
		
		WebElement statesel = driver.findElement(By.xpath("//select[@id=\"state\"]"));
		Select s2 = new Select(statesel);
		s2.selectByIndex(26);
	}

}
