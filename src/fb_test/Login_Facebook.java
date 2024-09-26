package fb_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.FacebookLoginPage;

public class Login_Facebook {

	//WebDriver driver;

	@Test
	public void logintoFacebook() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FacebookLoginPage fl = new FacebookLoginPage(driver);
		fl.username_call();
		fl.password_call();
		fl.login_click();
		//fl.create_account();
	}
}
