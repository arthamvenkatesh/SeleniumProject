package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutoSuggession_assignment98 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("baglore");
		Thread.sleep(1000);
		List<WebElement> a = driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		
		System.out.println(a.size());
		a.get(a.size()-10).click();

	}

}
