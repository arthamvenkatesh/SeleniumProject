package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverSetUp {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
