package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApolloPharmacy_Autosuggestion_Assignement101 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		
		WebElement searchfield = driver.findElement(By.xpath("//div[@data-placeholder=\"Search Medicines\"]"));
		searchfield.click();
		
		WebElement sf = driver.findElement(By.xpath("//input[@id=\"searchProduct\"]"));
		sf.sendKeys("pcm");
		
		Thread.sleep(2500);
		
		List<WebElement> allele =driver.findElements(By.xpath("//div[@class=\"MedicineAutoSearch_searchList___m_g7 null\"]/ul/li"));
		
		System.out.println(allele.size());
		
		allele.get(allele.size()-2).click();
		
		
		

	}

}
