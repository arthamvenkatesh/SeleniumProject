//Aamazon Search by Xpath - assignment 82#
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchXpath_Assignement82 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchfield.sendKeys("Mobiles");
	}

}
