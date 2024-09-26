package fb_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.FacebookLoginPage;
import fb_source.FacebookRegistrationFields;

public class Registration_FaceBook {

	@Test
	public void registrationFB() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
		
		FacebookRegistrationFields f = new FacebookRegistrationFields(driver);
		FacebookLoginPage fl = new FacebookLoginPage(driver);
		fl.create_account();
		//f.createbutton();
		f.firstname();
		f.lastname();
		f.regmail();
		f.passwords();
		f.malefemale();
		f.selectDay();
		f.selectMonth();
		f.selectYear();
		f.buttoncreate();
		

	}

}
