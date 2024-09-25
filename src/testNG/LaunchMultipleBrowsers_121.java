package testNG;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchMultipleBrowsers_121 {
	
	WebDriver driver;
	
	@Test
	public void Login() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Browser choice for 1 to 3");
		int choice = s.nextInt();
		
		if(choice==1) 
		{
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
		}
		else if(choice== 2)
		{
			driver = new FirefoxDriver();
			driver.get("http://www.google.com");
		}
		else if(choice == 3)
		{
			driver = new EdgeDriver();
			driver.get("http://www.google.com");
		}
		
		s.close();
	}

}
