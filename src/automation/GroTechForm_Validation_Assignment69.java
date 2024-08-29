package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechForm_Validation_Assignment69 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		

		WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
		fname.sendKeys("Artham");
		Thread.sleep(1500);
		WebElement laname = driver.findElement(By.xpath("//input[@id='lname']"));
		laname.sendKeys("Venkatesh");
		Thread.sleep(1500);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("venkatesh@mail.com");
		Thread.sleep(1500);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("a");
		Thread.sleep(1500);

		WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
		Thread.sleep(1500);
		if (radio.isSelected()) {
			System.out.println("selected");
		} else {
			radio.click();
		}
		Thread.sleep(1500);
		
		WebElement praddress = driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		praddress.sendKeys("Hyderabad");
		Thread.sleep(1500);

		WebElement psaddress = driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		psaddress.sendKeys("Hyderabad");
		Thread.sleep(1500);

		WebElement pindcode = driver.findElement(By.xpath("//input[@id='Pincode']"));
		pindcode.sendKeys("504125");
		Thread.sleep(1500);

		WebElement checkboxs = driver.findElement(By.xpath("//input[@value='relocate']"));

		if (checkboxs.isSelected()) {
			System.out.println("already selected");
		} else
			checkboxs.click();

	}

}
