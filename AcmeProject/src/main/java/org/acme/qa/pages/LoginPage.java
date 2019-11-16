package org.acme.qa.pages;

import org.acme.qa.base.SeleniumBase;
import org.acme.qa.baseAPI.ProjectSpecificMethods;

public class LoginPage extends SeleniumBase {

	public LoginPage enterUserName(String username) {

		clearAndType(locateElement("xpath", "(//input[@class ='form-control'])[1]"), username);
		//driver.findElementByXPath("(//input[@class ='form-control'])[1]").sendKeys(username);

		return this;
	}

	public LoginPage enterPassword(String password) {
		
		clearAndType(locateElement("xpath", "(//input[@class ='form-control'])[2]"), password);
		//driver.findElementByXPath("(//input[@class ='form-control'])[2]").sendKeys(password);
		
		return this;
	}
	
	public DashBoardPage clickOnLoginButton() {
		
		click(locateElement("xpath", "//button[text()='Log In']"));
		//driver.findElementByXPath("//button[text()='Log In']").click();
		
		return new DashBoardPage();
	}
}
