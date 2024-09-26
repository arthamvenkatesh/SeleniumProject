package testNG;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FBLogin_AddFriend {

	WebDriver driver;
	WebElement sl;
	
	@Test
	public void facebookAddFriend()
	{
		
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);
		ChromeDriver driver=new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("9573217406");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Venkatesh@123");
		
		WebElement loginclick = driver.findElement(By.name("login"));
		loginclick.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"]"));
		search.sendKeys("manish" +Keys.ENTER);
		
		////a[text()="Manish Kumar"]
		
		WebElement ma = driver.findElement(By.xpath("//a[text()=\"Manish Kumar\"]"));
		ma.click();
		
		/*List <WebElement> grid = driver.findElements(By.xpath("//div[@class=\"x78zum5 xdt5ytf x1xmf6yo x1e56ztr xq8finb x1n2onr6 xqcrz7y\"]"));
		System.out.println(grid.size());
		
		Iterator<WebElement> ele = grid.iterator();
		
		while(ele.hasNext()) {
			 sl =ele.next();
			break;
		}*/
		
	}

}
