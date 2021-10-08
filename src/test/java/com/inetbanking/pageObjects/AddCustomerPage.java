package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement linkAddCustomer;

	@FindBy(how = How.XPATH, using = "//input[@name='name']")
	@CacheLookup
	WebElement textcustomername;

	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement rdmaleGender;

	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	@CacheLookup
	WebElement rdfemaleGender;

	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement textdob;

	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement textAddress;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement textCity;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement textState;

	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement textpinno;

	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement textTelephno;

	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement textemailid;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement textpassword;

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnsubmit;

	@FindBy(how = How.NAME, using = "res")
	@CacheLookup
	WebElement btnreset;

	public void clickAddnewCustomer() {
		linkAddCustomer.click();
	}

	public void CustomerName(String cname) {
		textcustomername.sendKeys(cname);
	}

	public void maleGender() {
		rdmaleGender.click();
	}

	public void femaleGender() {
		rdfemaleGender.click();
	}

	public void custdob(String mm, String dd, String yyyy) {
		textdob.sendKeys(mm);
		textdob.sendKeys(dd);
		textdob.sendKeys(yyyy);
	}

	public void custAddress(String add1, String add2) {
		textAddress.sendKeys(add1);
		textAddress.sendKeys(add2);
	}

	public void custcity(String cty) {
		textCity.sendKeys(cty);
	}

	public void custstate(String st) {
		textState.sendKeys(st);
	}

	public void custpin(int pin) {
		textpinno.sendKeys(String.valueOf(pin));
	}
	
	public void custTelphn(String phn) {
		textTelephno.sendKeys(phn);
	}
	
	public void custEmail(String email) {
		textemailid.sendKeys(email);
	}
	
	public void custpassword(String passswd) {
		textpassword.sendKeys(passswd);
	}
	
	public void clksubmit() {
		btnsubmit.click();
	}
	
	public void clkReset() {
		btnreset.click();
	}
	
	

}	

	

