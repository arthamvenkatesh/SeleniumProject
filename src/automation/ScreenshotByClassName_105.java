package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotByClassName_105 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.linkText("Gmail"));
		a.contextClick(e).perform();
		
		Thread.sleep(1500);
		
		TakesScreenshot s = ((TakesScreenshot)driver);
		File f = s.getScreenshotAs(OutputType.FILE);
		File d = new File("D:\\Java By MKT\\ScreenShots\\RightClickImage"+ new ScreenshotByClassName_105().getClass() +".png");
		FileHandler.copy(f, d);

	}

}
