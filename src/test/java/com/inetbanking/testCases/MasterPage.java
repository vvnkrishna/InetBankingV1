package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilities.ReadConfig;

public class MasterPage {

	ReadConfig readcon = new ReadConfig();

	public String MainURL = readcon.getApplicationURL();
	public String Loginname = readcon.getUserName();
	public String Pwd = readcon.getPassword();
	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		logger = Logger.getLogger("InetBankingV1");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readcon.getGoogledriverpath());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readcon.getfirefoxdriverpath());
			driver = new FirefoxDriver();
		}

		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readcon.getInternetExplpath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(MainURL);
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/ScreenShots/" + tname + ".png");
		FileUtils.copyFile(source, target);

		System.out.println("ScreenShot Taken");

	}
	
	public String randomnamestring() {

		String generatednamestring = RandomStringUtils.randomAlphabetic(7);
		return (generatednamestring);
	}

	public String randomstring() {

		String generatedstring = RandomStringUtils.randomAlphabetic(4);
		return (generatedstring);
	}

	public static String randomNum() {

		String generatednumber = RandomStringUtils.randomNumeric(2);
		return (generatednumber);
	}

	public void Scrolldown() {
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	}
	
}
