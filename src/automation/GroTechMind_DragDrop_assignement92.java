package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechMind_DragDrop_assignement92 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement source = driver.findElement(By.xpath("//div[@id=\"container-6\"]"));
		WebElement dest = driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		
		Thread.sleep(1500);
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, dest).perform();
		
		Thread.sleep(1500);
		
		WebElement source1 = driver.findElement(By.xpath("//div[@id=\"container-6\"]"));
		WebElement dest1 = driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		a.dragAndDrop(dest1, source1).perform();

	}

}
