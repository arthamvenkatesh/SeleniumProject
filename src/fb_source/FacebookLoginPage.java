package fb_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	WebDriver driver;
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// create findelements methods for eachcomponent
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[text()=\"Create new account\"]")
	WebElement crateaccount;
	
	@FindBy(xpath="//a[text()=\"Create new account\"]")
	WebElement signin;
	
	
	//create a methods for each components
	public void username_call() {
		username.sendKeys("9573217406");
	}
	
	public void password_call() {
		password.sendKeys("Venkatesh@123");
	}
	
	public void login_click() {
		loginbutton.click();
	}
	
	public void create_account()
	{
		crateaccount.click();
	}
	
}
