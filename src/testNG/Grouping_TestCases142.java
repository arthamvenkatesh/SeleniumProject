package testNG;

import org.testng.annotations.Test;

public class Grouping_TestCases142 {
	
	
	@Test(groups= {"smoke"})
	public void launchtheBrowser() {
		
		System.out.println("Launching Browser");
	}
	
	@Test (groups= {"smoke"})
	public void loginApplcation()
	{
		System.out.println("Login into application");
	}
	
	@Test (groups= {"smoke","regression","system"})
	public void searching()
	{
		System.out.println("Searching ");
	}
	
	@Test (groups= {"smoke"})
	public void logoutApplication()
	{
		System.out.println("logout application");
	}

}
