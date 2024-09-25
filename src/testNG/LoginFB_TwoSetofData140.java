package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFB_TwoSetofData140 {
	
	WebDriver driver;
	String facebookusername;
	String facebookpassword;
	
	
	@Test (dependsOnMethods ="excelData", priority =2)
	public void fbLoginExcelSheet()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		WebElement username_textfield = driver.findElement(By.cssSelector("#email"));
		username_textfield.sendKeys(facebookusername);
		WebElement password_textfied = driver.findElement(By.cssSelector("#pass"));
		password_textfied.sendKeys(facebookpassword);
		WebElement singin_button = driver.findElement(By.cssSelector("#loginbutton"));
		singin_button.click();
		
	}
	
	@Test (priority= 1)
	public void excelData() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream f2 = new FileInputStream("H:\\\\Java 2024\\\\JavaPrograms\\\\SeleniumProject\\\\DataFetching\\\\DataProider.xlsx");
		Workbook w2 = WorkbookFactory.create(f2);
		facebookusername = NumberToTextConverter.toText(w2.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
		facebookpassword = w2.getSheet("login").getRow(2).getCell(1).getStringCellValue();

	}
	
	@Test(priority=3, dataProvider="fblogininfo")
	public void fbLoginDataprovider(String uname, String pwd)
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		WebElement username_textfield = driver.findElement(By.cssSelector("#email"));
		username_textfield.sendKeys(uname);
		WebElement password_textfied = driver.findElement(By.cssSelector("#pass"));
		password_textfied.sendKeys(pwd);
		WebElement singin_button = driver.findElement(By.cssSelector("#loginbutton"));
		singin_button.click();
	}
	
	@DataProvider (name = "fblogininfo")
	public Object[][] fblogin()
	{
		Object[][] ob = new Object[1][2];
		ob[0][0] = "9573217406";
		ob[0][1] = "Venkatesh@123";
		return ob;
	}

}
