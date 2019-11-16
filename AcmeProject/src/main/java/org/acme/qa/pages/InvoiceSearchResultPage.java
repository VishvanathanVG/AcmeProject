package org.acme.qa.pages;

import java.util.List;

import org.acme.qa.base.SeleniumBase;
import org.acme.qa.baseAPI.ProjectSpecificMethods;
import org.openqa.selenium.WebElement;

public class InvoiceSearchResultPage extends SeleniumBase{

	public InvoiceSearchResultPage getInvoiceNumber() {
		
		List<WebElement> count = locateElements("xpath", "//table[@class='table']//tr//td[text()='IT Support']//preceding-sibling::td[2]");
		//List<WebElement> count = driver.findElementsByXPath("//table[@class='table']//tr//td[text()='IT Support']//preceding-sibling::td[2]");
		System.out.println("data size is:"+ count.size());
		for (WebElement eachInvoiceNumber : count) {
			System.out.println("Invoice number is:"+ eachInvoiceNumber.getText());
			
		}
		
		return this;
	}
}
