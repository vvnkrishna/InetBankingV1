package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement txtUsername;

	@FindBy(name = "password")
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	WebElement LoginButton;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
	WebElement linklogout;

	public void setusername(String uname) {

		txtUsername.sendKeys(uname);

	}

	public void setpassword(String pass) {

		txtpassword.sendKeys(pass);

	}

	public void ClickSubmit() {

		LoginButton.click();

	}

	public void Logout() {

		linklogout.click();

	}

}
