//hoverover - Grotechmind to ReadMore
package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrotechMind_Hoverover_assignement91 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/automate-me/");
		
		WebElement Regapp = driver.findElement(By.xpath("//div[@data-id=\"d602956\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(Regapp).perform();
		Thread.sleep(1500);
		
		WebElement readmore = driver.findElement(By.partialLinkText("Read More"));
		readmore.click();

	}

}
