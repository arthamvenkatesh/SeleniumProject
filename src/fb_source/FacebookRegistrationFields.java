package fb_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationFields {

	WebDriver driver;
	Select sel;

	public FacebookRegistrationFields(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()=\"Create new account\"]")
	WebElement crateaccount;

	@FindBy(xpath = "//input[@name=\"firstname\"] ")
	WebElement fname;

	@FindBy(xpath = "//input[@name=\"lastname\"] ")
	WebElement lname;

	@FindBy(xpath = "//input[@name=\"reg_email__\"] ")
	WebElement regmail;

	@FindBy(xpath = "//input[@name=\"reg_passwd__\"] ")
	WebElement passwod;

	@FindBy(xpath = "//label[.=\"Male\"]")
	WebElement mfr;

	@FindBy(xpath = "//button[@name=\"websubmit\"]")
	WebElement sbutton;
	
	@FindBy(id="day")
	WebElement dayen;
	
	@FindBy(id="month")
	WebElement monthen;
	
	@FindBy(id="year")
	WebElement yearen;
	
	

	public void createbutton() {
		crateaccount.click();
	}

	public void firstname() {
		fname.sendKeys("abcd");
	}

	public void lastname() {
		lname.sendKeys("efgh");
	}

	public void regmail() {
		regmail.sendKeys("9878521589");
	}

	public void passwords() {
		passwod.sendKeys("1234567889");
	}

	public void malefemale() {
		mfr.click();
	}

	public void buttoncreate() {
		sbutton.click();
	}
	
	public void selectDay()
	{
		sel = new Select(dayen);
		sel.selectByVisibleText("3");
	}
	
	public void selectMonth()
	{
		sel = new Select(monthen);
		sel.selectByVisibleText("Jun");
	}
	
	public void selectYear()
	{
		sel = new Select(yearen);
		sel.selectByVisibleText("2000");
	}

}
