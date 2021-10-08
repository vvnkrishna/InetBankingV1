package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends MasterPage {
	
	@Test
	public void AddNewCustomer() throws IOException, Exception {
		
		LoginPage lp = new LoginPage(driver);

		lp.setusername(Loginname);
		logger.info("user name provided");
		lp.setpassword(Pwd);
		logger.info("Password given");
		lp.ClickSubmit();
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddnewCustomer();
		
		logger.info("Adding Customer Details");
		
		
		addcust.CustomerName("venu");		
		addcust.maleGender();
		addcust.custdob("10", "02", "2000");
		addcust.custAddress("MainRoad ", "kukatpally");
		addcust.custcity("Hyderabad");
		addcust.custstate("Telangana");
		addcust.custpin(500081);
		addcust.custTelphn("1234567890");
		
		String email = randomstring()+"@gmail.com";		
		addcust.custEmail(email);
		Thread.sleep(3000);
		addcust.custpassword("123456#abc");
		
		addcust.clksubmit();
		
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			
			logger.info("Added New Customer successfully");
			Assert.assertTrue(true);
			Scrolldown();
			String success = randomNum() + " AddNewCustomerSUccessfully";
			captureScreen(driver,success);
		}
		
		else
		{
			logger.info("AddNewCustomer failed");
			String failure = randomNum() + " Customer added failed";
			Scrolldown();
			captureScreen(driver,failure);
			Assert.assertTrue(false);	
		}
		
		
	}

}
