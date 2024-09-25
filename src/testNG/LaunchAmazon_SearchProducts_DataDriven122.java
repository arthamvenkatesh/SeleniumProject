package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchAmazon_SearchProducts_DataDriven122 {
	
	@Test (dataProvider="amazoninputdata")
	public void amazonSearchProduct(String amazoninputdata)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchfield = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchfield.sendKeys(amazoninputdata);
	}
	
	@DataProvider(name="amazoninputdata")
	public Object[][] datafetch()
	{
		return new Object[][] {{"mobiles"},{"tshirts"},{"books"},{"Pens"}};
		
	}

}
