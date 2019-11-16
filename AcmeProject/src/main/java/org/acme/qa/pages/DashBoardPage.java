package org.acme.qa.pages;

import org.acme.qa.base.SeleniumBase;
import org.acme.qa.baseAPI.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashBoardPage extends SeleniumBase{
	
	public DashBoardPage mouseOverOnInvoices() {
		
	
		WebElement invoiceElement = driver.findElementByXPath("//button[text()=' Invoices']");
		Actions builder = new Actions(driver);
		builder.moveToElement(invoiceElement).perform();
		 return this;
	}
	
	
	public InvoiceSearchPage clickOnSearchForInvoices() {
		
		click(locateElement("link", "Search for Invoice"));
		//driver.findElementByLinkText("Search for Invoice").click();
		
		return new InvoiceSearchPage();
	}

}
