package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GrotechRegistration_DataProvider125 {
	
	
	@Test (dataProvider="Information")
	public void registrationForm(String fn, String ln, String em, String pd, String psadd, String pdadd, String pcode) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");

		WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
		fname.sendKeys(fn);
		Thread.sleep(1500);
		
		WebElement laname = driver.findElement(By.xpath("//input[@id='lname']"));
		laname.sendKeys(ln);
		Thread.sleep(1500);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(em);
		Thread.sleep(1500);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pd);
		Thread.sleep(1500);

		WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
		Thread.sleep(1500);
		if (radio.isSelected()) {
			System.out.println("selected");
		} else {
			radio.click();
		}
		Thread.sleep(1500);
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select skillsdd = new Select(skills);
		skillsdd.selectByVisibleText("Technical Skills");
		
		WebElement country = driver.findElement(By.id("Country"));
		Select countrydd = new Select(country);
		countrydd.selectByVisibleText("India ");
		
		WebElement religion = driver.findElement(By.id("Relegion"));
		Select relogiondd = new Select(religion);
		relogiondd.selectByVisibleText("Hindu");
		
		WebElement praddress = driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		praddress.sendKeys(pdadd);
		Thread.sleep(1500);

		WebElement psaddress = driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		psaddress.sendKeys(psadd);
		Thread.sleep(1500);

		WebElement pindcode = driver.findElement(By.xpath("//input[@id='Pincode']"));
		pindcode.sendKeys(pcode);
		Thread.sleep(1500);

		WebElement checkboxs = driver.findElement(By.xpath("//input[@value='relocate']"));

		if (checkboxs.isSelected()) {
			System.out.println("already selected");
		} else
			checkboxs.click();
		
		
		WebElement signinbutton = driver.findElement(By.name("Submit"));
		signinbutton.click();

	}
	
	@DataProvider(name="Information")
	public Object[][] valuesInput()
	{
		Object[][] info = new Object[5][7];
		
		//1st Set
		info[0][0] = "manish";
		info[0][1] = "tiwari";
		info[0][2] = "manish@gmail.com";
		info[0][3] = "manish@123";
		info[0][4] = "Banglore";
		info[0][5] = "Banglore";
		info[0][6] = "50005";
		
		//2nd set
		info[1][0] = "abcd";
		info[1][1] = "efgh";
		info[1][2] = "abcd@gmail.com";
		info[1][3] = "abcd@123";
		info[1][4] = "Hyderbad";
		info[1][5] = "Hyderbad";
		info[1][6] = "50006";
		
		//3rd set
		info[2][0] = "Abhishek";
		info[2][1] = "Abhi";
		info[2][2] = "abhishek@gmail.com";
		info[2][3] = "abhishek@123";
		info[2][4] = "Pune";
		info[2][5] = "Pune";
		info[2][6] = "555555";
		
		//4th set
		info[3][0] = "Naresh";
		info[3][1] = "Nandhi";
		info[3][2] = "naresh@gmail.com";
		info[3][3] = "naresh@123";
		info[3][4] = "Chennai";
		info[3][5] = "Chennai";
		info[3][6] = "666595";
		
		//5th set
		info[4][0] = "Ramesh";
		info[4][1] = "Reddy";
		info[4][2] = "ramesh@gmail.com";
		info[4][3] = "ramesh@123";
		info[4][4] = "Vijayawada";
		info[4][5] = "Vijayawada";
		info[4][6] = "458965"; 
		
		return info;
	}

}
