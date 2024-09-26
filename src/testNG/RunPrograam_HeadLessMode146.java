package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RunPrograam_HeadLessMode146 {
	
	@Test
	public static void launchBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
	}

}
