package automation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClassName_1 {
	
	void takeScreenshot(ChromeDriver driver) throws IOException
	{
		Date d = new Date();
		String date = d.toString();
		System.out.println(date);
		
		String hours = date.substring(11,13);
		String minutes = date.substring(13, 17);
		String seconds = date.substring(17, 20);
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		TakesScreenshot s = ((TakesScreenshot)driver);
		File f = s.getScreenshotAs(OutputType.FILE);
		File de = new File(("D:\\Java By MKT\\ScreenShots\\sss")+ seconds +(".png"));
		FileHandler.copy(f, de);
	}

}
