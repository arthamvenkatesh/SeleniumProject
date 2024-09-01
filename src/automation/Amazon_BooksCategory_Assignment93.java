package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_BooksCategory_Assignment93 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

		Select s = new Select(e);
		s.selectByVisibleText("Books");

	}

}
