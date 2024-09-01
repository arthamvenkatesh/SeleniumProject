//In google search type INDIA by using tagname locator#
package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_India_usingTagName_Assignment86 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchfiled= driver.findElement(By.tagName("textarea"));
		searchfiled.sendKeys("india");
	}

}
