package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.NewAccountPage;

public class TC_NewAccountTest_005 extends MasterPage{
	
	
	
	@Test(priority = 1)
	public void NewAccount1() throws Exception {
		
		LoginPage lp = new LoginPage(driver);

		lp.setusername(Loginname);
		logger.info("user name provided");
		lp.setpassword(Pwd);
		logger.info("Password given");
		lp.ClickSubmit();
		
		
		NewAccountPage nac = new NewAccountPage(driver);
		nac.NACclickNewAccout();
		nac.NACenterCustomerID("14257");
		nac.NACclickSavingsType();
		nac.NACenterIntialDeposit(10);
		captureScreen(driver, "DetailsEnteredBeforeReset");
		nac.clickNACreset();
		Thread.sleep(3000);
		nac.clickNACreturnHome();
		
		}
	
	@Test(priority = 2)
	public void NewAccount2() throws IOException, Exception {
		
		NewAccountPage nac1 = new NewAccountPage(driver);
		nac1.NACclickNewAccout();
		nac1.NACenterCustomerID("14257");
		Thread.sleep(3000);
		nac1.NACclickCurrentType();
		Thread.sleep(3000);
		nac1.NACenterIntialDeposit(500);
		Thread.sleep(3000);
		nac1.clickNACsubmit();
		Thread.sleep(5000);
	
		boolean res = driver.getPageSource().contains("Account Generated Successfully!!!");

		if (res == true) {

			logger.info("Add Account details entered successfully");
			Assert.assertTrue(true);
			Scrolldown();
			String success = randomNum() + " Account Generated SUccessfully";
			captureScreen(driver, success);
		}

		else {
			logger.info("Adding account failure");
			String failure = randomNum() + " Adding account failed";
			captureScreen(driver, failure);
			Assert.assertTrue(false);

		}
		
	}

	
	
}
