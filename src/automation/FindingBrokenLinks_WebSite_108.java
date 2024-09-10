//broken links - need to do somethings
package automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinks_WebSite_108 {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(int i=0; i<li.size();i++) {
			
			WebElement e = li.get(i);
			String url = e.getAttribute("href");
			System.out.println(url);
			
			String text = e.getText();
			System.out.println(text);
			
			verify_the_link(url);

		}

	}

	static void verify_the_link(String url) throws IOException {

		try {
		URL u1 = new URL(url);
		HttpURLConnection u2= (HttpURLConnection)u1.openConnection();

		if(u2.getResponseCode()==200) {
			System.out.println("validlink" +u2.getResponseMessage()+" "+u2.getResponseCode());
		}
		else {
			System.out.println("its invalid link" +u2.getResponseMessage()+" "+u2.getResponseCode());
		}
		}catch(MalformedURLException m) {
			System.out.println("error handled");
		}
	}
}
