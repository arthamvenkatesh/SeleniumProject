package automation;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerSetup {

	public static void main(String[] args) {
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}
