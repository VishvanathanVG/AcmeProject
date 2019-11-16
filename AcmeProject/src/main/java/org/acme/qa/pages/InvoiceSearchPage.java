package org.acme.qa.pages;

import org.acme.qa.base.SeleniumBase;
import org.acme.qa.baseAPI.ProjectSpecificMethods;

public class InvoiceSearchPage extends SeleniumBase{

	public InvoiceSearchPage enterInvoiceNumber(String vendorTaxId) {
		
		clearAndType(locateElement("id", "vendorTaxID"), vendorTaxId);
		//driver.findElementById("vendorTaxID").sendKeys(vendorTaxId);
		
		return this;
	}
	
	public InvoiceSearchResultPage clickOnSearchBtnForInvoices() {
		
		click(locateElement("xpath", "//button[text()='Search']"));
		//driver.findElementByXPath("//button[text()='Search']").click();
		
		return new InvoiceSearchResultPage();
	}
}
