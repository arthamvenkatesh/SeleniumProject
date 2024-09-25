package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_IntType123 {

	@Test (dataProvider="input")
	public void numberData (int input)
	{

		System.out.println(input);
	}
	
	@DataProvider(name="input")
	public Object[][] datainput()
	{
		return new Object[][] {{10},{20},{30}};
		
	}

}
