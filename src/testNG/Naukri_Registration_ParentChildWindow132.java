package testNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Naukri_Registration_ParentChildWindow132 {
	
	WebDriver driver;
	
	@Test ()
	public void naukriLogin() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI-vLft7_YiAMVjw-DAx10xheTEAAYASAAEgJ6MPD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		//Thread.sleep(1500);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement signinbutton = driver.findElement(By.xpath("//span[text()='Google']"));
		signinbutton.click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> elements = windows.iterator();
		String parentwindow = elements.next();
		String childwindow = elements.next();
		
		System.out.println(parentwindow);
		System.out.println(childwindow);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentwindow);
		
		driver.close();
		
		driver.switchTo().window(childwindow);
		System.out.println("last" +driver.getTitle());
		driver.close();
	}

}
