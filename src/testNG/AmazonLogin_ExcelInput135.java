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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin_ExcelInput135 {
	
	WebDriver driver;
	String amazonusername;
	String amazonpassword;
	
	@Test (dependsOnMethods="loadExcelData")
	public void amazon_Login()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement list = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		act.moveToElement(list).perform();
		
		WebElement Signin = driver.findElement(By.xpath("//span[text()=\"Sign in\"][1]"));
		Signin.click();
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(amazonusername);
		
		WebElement conbutton = driver.findElement(By.cssSelector("#continue"));
		conbutton.click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(amazonpassword);
		
		WebElement loginbutton = driver.findElement(By.id("signInSubmit"));
		loginbutton.click();
	}
	
	
	@Test
	public void loadExcelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream f2 = new FileInputStream("H:\\\\Java 2024\\\\JavaPrograms\\\\SeleniumProject\\\\DataFetching\\\\DataProider.xlsx");
		Workbook w2 = WorkbookFactory.create(f2);
		amazonusername = NumberToTextConverter.toText(w2.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
		amazonpassword = w2.getSheet("login").getRow(2).getCell(1).getStringCellValue();
	}

}
