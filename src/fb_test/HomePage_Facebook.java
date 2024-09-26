package fb_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.FacebookHomepage;
import fb_source.FacebookLoginPage;

public class HomePage_Facebook {
	
	WebDriver driver;
	
	@Test
	public void searchFriend()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FacebookLoginPage fl = new FacebookLoginPage(driver);
		fl.username_call();
		fl.password_call();
		fl.login_click();
		
		FacebookHomepage fh = new FacebookHomepage(driver);
		fh.fbsearchfieldelement();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		fh.friendprofileclick();
		
	}

}
