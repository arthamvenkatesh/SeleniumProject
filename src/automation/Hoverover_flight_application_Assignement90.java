package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_flight_application_Assignement90 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/automate-me/");
		
		WebElement flight = driver.findElement(By.xpath("//div[@data-id=\"e3e596b\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(flight).perform();
		Thread.sleep(1500);
		
		WebElement readmore = driver.findElement(By.xpath("(//a[@class= \"elementor-flip-box__button elementor-button elementor-size-sm\"])[2]"));
		readmore.click();

	}

}
