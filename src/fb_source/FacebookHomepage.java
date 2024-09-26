package fb_source;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomepage {
	
	WebDriver driver;
	
	public FacebookHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Search Facebook\"]")
	WebElement fbsearchfield;
	
	@FindBy(xpath="//a[text()=\"Manish Kumar\"]")
	WebElement friedprofile;
	
	public void fbsearchfieldelement()
	{
		fbsearchfield.sendKeys("manish" +Keys.ENTER);
	}

	public void friendprofileclick()
	{
		friedprofile.click();
	}

}
