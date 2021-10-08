package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.Utilities.XLUtilis;
import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginDDT_002 extends MasterPage {

	public XSSFRow row;
	public XSSFCell cell;

	public XSSFWorkbook wb;

	int rowcount;
	int colomncount;

	@Test(dataProvider = "LoginData")
	public void loginDDT(String customer, String pwd) throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.setusername(customer);
		logger.info("Customer name provided");
		lp.setpassword(pwd);
		logger.info("Password provided");
		lp.ClickSubmit();
		Thread.sleep(3000);

		if (isAssertPresent() == true) {

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();

			Assert.assertTrue(false);
			logger.warn("Login failed");

		} else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			Thread.sleep(3000);
			lp.Logout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();

		}
	}

	public boolean isAssertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@DataProvider(name = "LoginData")

	String[][] getData() throws IOException, Exception {

		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		Thread.sleep(3000);

		int rownum = XLUtilis.getRowCount(path, "logins");
		int cellnum = XLUtilis.getCellCount(path, "logins", 1);

		String logindata[][] = new String[rownum][cellnum];

		for (int i = 1; i <= rownum; i++) {

			for (int j = 0; j < cellnum; j++) {

				logindata[i - 1][j] = XLUtilis.getCellData(path, "logins", i, j);
			}

		}
		Thread.sleep(3000);
		return logindata;
	}

}
