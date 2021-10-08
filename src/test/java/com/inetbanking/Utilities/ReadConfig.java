package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		File src = new File("./Configuration/Configuration.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {

		String url = prop.getProperty("MainURL");
		return url;
	}

	public String getUserName() {

		String UserName = prop.getProperty("Loginname");
		return UserName;

	}

	public String getPassword() {

		String Password = prop.getProperty("Pwd");
		return Password;

	}
	
	public String getGoogledriverpath() {

		String Chrome = prop.getProperty("ChromePath");
		return Chrome;

	}
	
	public String getfirefoxdriverpath() {

		String firefox = prop.getProperty("FireFoxPath");
		return firefox;
	}
	
	public String getInternetExplpath() {

		String IE = prop.getProperty("IEPAth");
		return IE;
	}
		
}
