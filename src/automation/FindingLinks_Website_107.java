package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks_Website_107 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(int i=0; i<li.size();i++) {
			
			WebElement e = li.get(i);
			String url = e.getAttribute("href");
			System.out.println(url);
			
			String text = e.getText();
			System.out.println(text);

		}

	}

}
