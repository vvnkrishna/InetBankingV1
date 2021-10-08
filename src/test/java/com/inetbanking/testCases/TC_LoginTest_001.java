package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends MasterPage {

	@Test
	public void loginTest() throws IOException {

		

		LoginPage lp = new LoginPage(driver);

		lp.setusername(Loginname);
		lp.setpassword(Pwd);
		lp.ClickSubmit();

		logger.info("Title is : " + driver.getTitle());

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			
			Assert.assertTrue(true);
			
			logger.info("Assertion pass");
			
			
		}
		else {
			
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);			
			logger.info("Assertion failed");
			
		}

	}

}
