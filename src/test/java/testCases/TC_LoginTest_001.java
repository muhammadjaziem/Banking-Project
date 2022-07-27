package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL); 
		Logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Entered Username");
		lp.setPassword(password);
		Logger.info("Entered password");
		
		lp.clickSubmit();
	
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			Logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			Logger.info("Login test failed");
		}
	}

}
