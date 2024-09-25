package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer implements IRetryAnalyzer{

	int current_count = 0;
	int noofretry = 4;
	
	@Override
	public boolean retry(ITestResult result) {
		
		System.out.println("control comes here");
		
		if(current_count < noofretry)
		{
			current_count ++;
			return true;
		}
		
		return false;
	}

}
