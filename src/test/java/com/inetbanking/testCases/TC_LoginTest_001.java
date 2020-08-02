package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public void loginTest() {
		
		logger.info("URL is open ");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username  ");
		lp.setPassword(password);
		logger.info("Entred password ");
		lp.ClickSubmit();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed ");
		}else {
			captureScreenshot( driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test failed ");
		}
			
		
	}

}
