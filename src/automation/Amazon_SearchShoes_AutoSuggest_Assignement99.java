package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchShoes_AutoSuggest_Assignement99 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoe");

		Thread.sleep(1500);
		
		List<WebElement> f = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		System.out.println(f.size());
		
		f.get(f.size()-7).click();
		
	}

}
