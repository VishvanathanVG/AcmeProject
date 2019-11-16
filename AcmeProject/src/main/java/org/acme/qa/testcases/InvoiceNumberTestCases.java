package org.acme.qa.testcases;

import org.acme.qa.base.SeleniumBase;
import org.acme.qa.baseAPI.ProjectSpecificMethods;
import org.acme.qa.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvoiceNumberTestCases  extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp() {
		
		ExcelFileName ="Acme";
		Sheetname="Acme";
	}
	
	@Test(dataProvider="acmeData")
	public void runInvoiceNumberFindTestCases(String username,String password,String vendortaxid) {
		
		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName(username).enterPassword(password).clickOnLoginButton()
		.mouseOverOnInvoices().clickOnSearchForInvoices().enterInvoiceNumber(vendortaxid).clickOnSearchBtnForInvoices()
		.getInvoiceNumber();
	
		
	}

}
