package testNG;

import org.testng.annotations.Test;

public class TestCase_Enabled_Disabled_118 {
	
	@Test
	public void login() {
		System.out.println("login into application");
	}

	@Test
	public void logout() {
		System.out.println("logout application");
	}
	
	@Test (enabled = false) // this test case not executes becaues enabled is false
	public void search() {
		System.out.println("Searching a product after login into application");
	}
}
