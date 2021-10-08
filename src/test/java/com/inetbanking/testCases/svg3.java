package com.inetbanking.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class svg3 {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/search?q=tcs+share+price&ei=Pb1ZYbSrDpPA3LUP3aWG-AU&ved=0ahUKEwj0vb7-uK7zAhUTILcAHd2SAV8Q4dUDCA0&uact=5&oq=tcs+share+price&gs_lcp=Cgdnd3Mtd2l6EAMyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEcyBAgAEEc6BwgAEEcQsAM6BwgAELADEENKBQg6EgExSgUIPBIBMUoECEEYAEoFCEASATFQoglYoglgsw9oAXACeACAAQCIAQCSAQCYAQCgAQHIAQjAAQE&sclient=gws-wiz");
		
		List<WebElement> graph = driver.findElements(By.xpath("//*[local-name()='svg' and @class='uch-psvg']//*[name()='clipPath']//*[name()='rect']"));
		
		
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		for(WebElement e : graph) {
			
			act.moveToElement(e).perform();
			
		}
		
		//act.dragAndDrop(src, dst).perform();
	}


}
