
package rahulshettyacademy.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;

public class ErrorValidations extends BaseTest{
	
	@Test(groups= {"ErrorHandling"},retryAnalyzer=rahulshettyacademy.TestComponents.Retry.class)
	public void Loginerrorvalidation() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		String productName="ZARA COAT 3";		
		
		landingPage.loginApplication("anshika@gmail.com", "Iamki@000ytyt");
		
		Assert.assertEquals("Incorrect email  password.", landingPage.getErrorMessage());

	}
	
	
	@Test
	public void submitOrder56() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		String productName="ZARA COAT 3";		
		
		landingPage.loginApplication("anshika@gmail.com", "Iamki@000");
		
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());

	}

}
