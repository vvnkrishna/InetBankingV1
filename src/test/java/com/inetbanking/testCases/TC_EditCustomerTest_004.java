package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends MasterPage {

	@Test
	public void EditCustomer() throws Exception {

		LoginPage lp = new LoginPage(driver);

		lp.setusername(Loginname);
		logger.info("user name provided");
		lp.setpassword(Pwd);
		logger.info("Password given");
		lp.ClickSubmit();

		EditCustomerPage edcust = new EditCustomerPage(driver);

		edcust.e_clickEditCustomer();
		edcust.e_EnterCustomerID("23180");
		edcust.e_beforclicksubmit();
		Thread.sleep(3000);

		logger.info("Editing existing customer details");

		Scrolldown();
		captureScreen(driver, "Before Edit details");
		Thread.sleep(2000);
		edcust.e_Addressclear();
		edcust.e_custAddress("BalajiNagar", " RushiKonda");
		edcust.e_cityclear();
		edcust.e_custcity("Visakapatnam");
		edcust.e_stateclear();	
		edcust.e_custstate("AndhraPradesh");
		edcust.e_pinclear();		
		edcust.e_custpin(533207);
		edcust.e_Telphnclear();
		edcust.e_custTelphn("98745");
		edcust.e_Emailclear();
		edcust.e_custEmail("guru99@gmail.com");
		edcust.e_afterclicksubmit();

		Thread.sleep(3000);

		boolean res = driver.getPageSource().contains("Customer details updated Successfully!!!");

		if (res == true) {

			logger.info("Customer details edited successfully");
			Assert.assertTrue(true);
			Scrolldown();
			String success = randomNum() + " Edited Customer details SUccessfully";
			captureScreen(driver, success);
		}

		else {
			logger.info("Edit customer details failed");
			String failure = randomNum() + " Edit customer details failed";
			captureScreen(driver, failure);
			Assert.assertTrue(false);

		}

	}

}
