package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin_EmptyCell137 {
	
	WebDriver driver;
	
	@Test
	public void amazonLogin_invaliUrl() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream f1 = new FileInputStream("H:\\Java 2024\\JavaPrograms\\SeleniumProject\\DataFetching\\DataProider.xlsx");
		Workbook b1 = WorkbookFactory.create(f1);
		String url = b1.getSheet("login").getRow(3).getCell(0).getStringCellValue();
		System.out.println(url);
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
