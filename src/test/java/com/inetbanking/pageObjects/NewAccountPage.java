package com.inetbanking.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {

	WebDriver ldriver;

	public NewAccountPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement clknewacc;

	@FindBy(how = How.XPATH, using = "//select[@name='selaccount']/option")
	@CacheLookup
	List<WebElement> NACAccountType;
	
	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement NACcustomerID;
	
	@FindBy(how = How.NAME, using = "inideposit")
	@CacheLookup
	WebElement NACinitdeposit;
	
	@FindBy(how = How.NAME, using = "button2")
	@CacheLookup
	WebElement NACsubmit;
	
	@FindBy(how = How.NAME, using = "reset")
	@CacheLookup
	WebElement NACreset;
	
	@FindBy(how = How.XPATH, using = "/html/body/p/a")
	@CacheLookup
	WebElement ReturnHome;
	
	
	public void NACclickNewAccout() {
		clknewacc.click();
	}
	
	public void NACenterCustomerID(String cuid) {
		NACcustomerID.sendKeys(cuid);		
	}
	
	public void NACclickSavingsType() {
		NACAccountType.get(0).click();
	}

	public void NACclickCurrentType() {
		NACAccountType.get(1).click();
	}

	public void NACenterIntialDeposit(int entervalue) {
		NACinitdeposit.sendKeys(String.valueOf(entervalue));
	}
	
	public void clickNACsubmit() {
		NACsubmit.click();
	}
	
	public void clickNACreset() {
		NACreset.click();
	}
	
	public void clickNACreturnHome() {
		ReturnHome.click();
	}
}

