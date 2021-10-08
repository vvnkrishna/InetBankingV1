package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

	WebDriver ldriver;

	public EditCustomerPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement linkEditCustomer;

	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement customerID;

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

	@FindBy(how = How.NAME, using = "AccSubmit")
	@CacheLookup
	WebElement BeforeEditbtnsbt;

	@FindBy(how = How.NAME, using = "res")
	@CacheLookup
	WebElement BeforeEditbtnrst;

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement AfterEditbtnsbt;

	@FindBy(how = How.NAME, using = "res")
	@CacheLookup
	WebElement AfterEditbtnrst;

	public void e_clickEditCustomer() {
		linkEditCustomer.click();
	}

	public void e_EnterCustomerID(String cuid) {
		customerID.sendKeys(cuid);
	}

	public void e_beforclicksubmit() {
		BeforeEditbtnsbt.click();
	}

	public void e_beforeclickreset() {
		BeforeEditbtnrst.click();
	}
	
	public void e_Addressclear() {
		textAddress.clear();
	}

	public void e_custAddress(String add1, String add2) {
		textAddress.sendKeys(add1);
		textAddress.sendKeys(add2);
	}

	public void e_cityclear() {
		textCity.clear();
	}
	public void e_custcity(String cty) {
		textCity.sendKeys(cty);
	}
	
	public void e_stateclear() {
		textState.clear();
	}

	public void e_custstate(String st) {
		textState.sendKeys(st);
	}
	
	public void e_pinclear() {
		textpinno.clear();	
	}

	public void e_custpin(int pin) {
		textpinno.sendKeys(String.valueOf(pin));
	}
	
	public void e_Telphnclear() {
		textTelephno.clear();
	}

	public void e_custTelphn(String phn) {
		textTelephno.sendKeys(phn);
	}

	public void e_Emailclear() {
		textemailid.clear();
	}
	
	public void e_custEmail(String email) {
		textemailid.sendKeys(email);
	}

	public void e_afterclicksubmit() {
		AfterEditbtnsbt.click();
	}

	public void e_afterclickreset() {
		AfterEditbtnrst.click();
	}

}
