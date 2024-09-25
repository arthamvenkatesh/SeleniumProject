package testNG;

import org.testng.annotations.Test;

public class TestCase_Priority_InvocationCount_119 {

	@Test
	public void login() {
		System.out.println("login into application");
	}

	@Test
	public void logout() {
		System.out.println("logout application");
	}
	
	@Test (priority = 3, invocationCount=5)
	public void search() {
		System.out.println("Searching a product after login into application");
	}

}
