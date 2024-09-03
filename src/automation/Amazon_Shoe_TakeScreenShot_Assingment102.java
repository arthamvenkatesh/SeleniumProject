package automation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe_TakeScreenShot_Assingment102 {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoe");

		Thread.sleep(1500);
		
		List<WebElement> f = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		System.out.println(f.size());
		
		f.get(f.size()-7).click();
		
		
		TakesScreenshot s =((TakesScreenshot)driver);
		File source = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Java By MKT\\ScreenShots\\image.png");
		org.openqa.selenium.io.FileHandler.copy(source, dest);
	

	}

}
