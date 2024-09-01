//GroTechmind Registration form - dropdown list
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechRegistration_PerformDropdown_Assignment87 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement skill = driver.findElement(By.xpath("//select[@name=\"Skills\"]"));
		Select s = new Select(skill);
		s.selectByVisibleText("Technical Skills");
		
		WebElement country = driver.findElement(By.xpath("//select[@name=\"Country\"]"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		WebElement religion = driver.findElement(By.xpath("//select[@name=\"Relegion\"]"));
		Select s2 = new Select(religion);
		s2.selectByValue("Hindu");
	}

}
